package com.neu.bank.controller.creditCard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String cardId = req.getParameter("cardId");
		String oldPass = req.getParameter("oldPass");
		String newPass1 = req.getParameter("newPass1");
		String newPass2 = req.getParameter("newPass2");
		
		String res = cs.queryPass(cardId, newPass1, newPass2, oldPass);
 	}
}
