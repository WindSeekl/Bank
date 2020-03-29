package com.neu.bank.controller.creditCard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.neu.bank.po.CreditLimit;
import com.neu.bank.service.creditCard.CreditService;
import com.neu.bank.service.creditCard.impl.CreditServiceImpl;

@WebServlet("/limitController")
public class LimitController extends HttpServlet{
	
	/**
	 * 
	 */
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
		String mark = req.getParameter("mark");
		String cardId = req.getParameter("cardId");
		req.setAttribute("cardId", cardId);
		String jsonStr = null;
		if(mark.equals("query"))
			jsonStr = queryLimit(req, resp, cardId);
		else 
			jsonStr = JSONObject.toJSONString(setLimit(req, resp));
		
		resp.setContentType("application/json;charset=utf-8");
		resp.getWriter().println(jsonStr); 
	}
	protected String queryLimit(HttpServletRequest req, HttpServletResponse resp, String cardId) {
		CreditLimit cl = null;
		String password = req.getParameter("queryPass");
		if(!cardId.isEmpty() && !password.isEmpty()) {
			cl = cs.queryLimit(cardId, password);
			String jsonStr = JSONObject.toJSONString(cl);
			return jsonStr;
		}
		return null;
	}
	protected String setLimit(HttpServletRequest req, HttpServletResponse resp) {
		String cardId = (String) req.getAttribute("cardId");
		System.out.println("1" + cardId);
		String limit = req.getParameter("setLimitt");
		double li = Double.parseDouble(limit);
		return cs.setLimit(cardId, li);
	}
}
