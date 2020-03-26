package com.neu.bank.controller.Card;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.neu.bank.dao.Card.CardDao;
import com.neu.bank.dao.Card.Impl.CardDaoImpl;
import com.neu.bank.service.Card.CardService;
import com.neu.bank.service.Card.Impl.CardServiceImpl;
@WebServlet("/CardController")
public class CardContorller extends HttpServlet{
	
	private CardService cs = new CardServiceImpl();
	private CardDao cd = new CardDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String res = null;
		String cardId = req.getParameter("cardId");
		String newpass1 = req.getParameter("newpass1");
		String newpass2 = req.getParameter("newpass2");
		String oldpass = req.getParameter("oldpass");
		if(newpass1.equals(newpass2)) {
			res = cs.updatePass(newpass1, oldpass, cardId);
		}else {	
			res = "两次输入密码不一致";
		}
		System.out.println(cd.queryId());
		String jsonStr = JSONObject.toJSONString(res);
		resp.setContentType("application/json;charset=utf-8");
		resp.getWriter().println(jsonStr);
	}
}
