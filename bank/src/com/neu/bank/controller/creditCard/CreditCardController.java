package com.neu.bank.controller.creditCard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.neu.bank.service.creditCard.CreditService;
import com.neu.bank.service.creditCard.impl.CreditServiceImpl;

@WebServlet("/creditCard")
public class CreditCardController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private CreditService cs = new CreditServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String res = null;
		String mark = req.getParameter("mark");
		if(mark.contains("Pass"))
			res = updatePass(req, resp, mark);
		else if(mark.equals("active") || mark.equals("report"))
			res = activateCard(req, resp, mark);
		String jsonStr = JSONObject.toJSONString(res);
		resp.setContentType("application/json;charset=utf-8");
		resp.getWriter().println(jsonStr);
 	}
	
	public String updatePass(HttpServletRequest req, HttpServletResponse resp, String mark) {
		String cardId = req.getParameter("cardId");
		String oldPass = req.getParameter("oldPass");
		String newPass1 = req.getParameter("newPass1");
		String newPass2 = req.getParameter("newPass2");
		if(!cardId.isEmpty() && !oldPass.isEmpty() && !newPass1.isEmpty() && !newPass2.isEmpty()) {
			return cs.queryPass(cardId, newPass1, newPass2, oldPass, mark);
		}else
			return "信息不能为空";
	}
	
	public String activateCard(HttpServletRequest req, HttpServletResponse resp, String mark) {
		String cardId = req.getParameter("cardId");
		String alterPass = req.getParameter("alterPass");
		String queryPass = req.getParameter("queryPass");
		if(!cardId.isEmpty() && !queryPass.isEmpty() && !alterPass.isEmpty())
			return cs.activateCard(cardId, queryPass, alterPass, mark);
		else
			return "信息不能为空";
	}
}
