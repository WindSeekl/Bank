package com.neu.bank.controller.creditCard;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.bank.po.CreditBill;
import com.neu.bank.service.creditCard.CreditService;
import com.neu.bank.service.creditCard.impl.CreditServiceImpl;

@WebServlet("/billController")
public class BillController extends HttpServlet{

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
		if(mark.equals("already"))
			alreadyBill(req, resp, mark);
		else if(mark.equals("not"))
			notBill(req, resp, mark);
			
	}
	
	protected void alreadyBill(HttpServletRequest req, HttpServletResponse resp, String mark) {
		String cardId = req.getParameter("cardId");
		String beginTime = req.getParameter("beginTime");
		String endTime = req.getParameter("endTime");

		List<CreditBill> list = cs.queryBill(cardId, beginTime, endTime, mark);
	}
	
	protected void notBill(HttpServletRequest req, HttpServletResponse resp, String mark) {
	}
}
