package com.neu.bank.controller.regist;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.bank.service.regist.registService;
import com.neu.bank.service.regist.Impl.registServiceImpl;
@WebServlet("/regists")
public class registController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uName=req.getParameter("registUser");
		String uPass=req.getParameter("registPass");
		String uPass2=req.getParameter("registPass2");
		Writer wr = resp.getWriter();
		if (!uName.isEmpty()) {
			if (!uPass.isEmpty()) {
				if (!uPass2.isEmpty()) {
				if (uPass.equals(uPass2)) {
					registService RS=new registServiceImpl();
					RS.regist(uName, uPass);
					  wr.write("<script type=\"text/javascript\">alert(\"注册成功\") </script>");
					    wr.flush();
					    RequestDispatcher  rd = req.getRequestDispatcher("../index.jsp");  
						rd.forward(req, resp);
					
				} else if(uPass!=uPass2){
					 resp.setContentType("text/html; charset=UTF-8"); //转码
					  wr.write("<script type=\"text/javascript\">alert(\"输入的两次密码不一致\") </script>");
					    wr.flush();
					    RequestDispatcher  rd = req.getRequestDispatcher("regist.jsp");  
						rd.forward(req, resp);
				}
					
					
				} else {
					 wr.write("<script type=\"text/javascript\">alert(\"密码不能为空\") </script>");
					    wr.flush();
				}
			} else {
				 wr.write("<script type=\"text/javascript\">alert(\"密码不能为空\") </script>");
				    wr.flush();
			}
		} else {
			 wr.write("<script type=\"text/javascript\">alert(\"用户名不能为空\") </script>");
			    wr.flush();
		}
		
		
		
	}
}
