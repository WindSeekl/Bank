package com.neu.bank.controller.Card;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.neu.bank.po.Card;
import com.neu.bank.service.Card.CardService;
import com.neu.bank.service.Card.Impl.CardServiceImpl;
@WebServlet("/GlContorller")
public class GlContorller extends HttpServlet{
	private CardService cs = new CardServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String obUserId = "1212556";
		List<Card> str = cs.queryAll(obUserId);
		String jsonStr = JSONArray.toJSONString(str);
		resp.setContentType("application/json;charset=utf-8");
		resp.getWriter().println(jsonStr);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	};
	
}
