package com.neu.bank.controller.Card;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.bank.service.Card.CardService;
import com.neu.bank.service.Card.Impl.CardServiceImpl;
@WebServlet("/DelContorller")
public class DelContorller extends HttpServlet{
	private CardService cs = new CardServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String[] cardId = req.getParameterValues("cId");//获取删除的卡号
		for (String string : cardId) {
			cs.del(string);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
