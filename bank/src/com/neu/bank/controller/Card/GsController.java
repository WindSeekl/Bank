package com.neu.bank.controller.Card;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.neu.bank.po.Card;
import com.neu.bank.service.Card.CardService;
import com.neu.bank.service.Card.Impl.CardServiceImpl;
@WebServlet("/GsContorller")
public class GsController extends HttpServlet{
	private CardService cs = new CardServiceImpl();
	private Card card = new Card();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String res = null;
		String cardId = req.getParameter("cardId");
		String pwd = req.getParameter("pass");
			if (pwd!=null) {
				if (card.getState() == true) {
					res = cs.updateState(1, pwd, cardId);
				}
			}
		String jsonStr = JSONObject.toJSONString(res);
		resp.setContentType("application/json;charset=utf-8");
		resp.getWriter().println(jsonStr);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
