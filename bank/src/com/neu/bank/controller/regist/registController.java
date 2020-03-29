package com.neu.bank.controller.regist;

import java.io.IOException;
import java.io.PrintWriter;

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
		if (uName!="") {
			if (uPass!="") {
				if (uPass2!="") {
				if (uPass==uPass2) {
					registService RS=new registServiceImpl();
					RS.regist(uName, uPass);
					
					
					
				} else if(uPass!=uPass2){
					 resp.setContentType("text/html; charset=UTF-8"); //转码
					    PrintWriter out = resp.getWriter();
					    out.flush();
					    out.println("<script>");
					    out.println("alert('两次输入密码不一致请重新输入！');");
					    out.println("history.back();");
					    out.println("</script>");
					    RequestDispatcher  rd = req.getRequestDispatcher("regist.jsp");  
						rd.forward(req, resp);
				}
					
					
				} else {
					  resp.setContentType("text/html; charset=UTF-8"); //转码
					    PrintWriter out = resp.getWriter();
					    out.flush();
					    out.println("<script>");
					    out.println("alert('密码不能为空！');");
					    out.println("history.back();");
					    out.println("</script>");
					    RequestDispatcher  rd = req.getRequestDispatcher("regist.jsp");  
						rd.forward(req, resp);
				}
			} else {
				  resp.setContentType("text/html; charset=UTF-8"); //转码
				    PrintWriter out = resp.getWriter();
				    out.flush();
				    out.println("<script>");
				    out.println("alert('密码不能为空！');");
				    out.println("history.back();");
				    out.println("</script>");
				    RequestDispatcher  rd = req.getRequestDispatcher("regist.jsp");  
					rd.forward(req, resp);
			}
		} else {
			  resp.setContentType("text/html; charset=UTF-8"); //转码
			    PrintWriter out = resp.getWriter();
			    out.flush();
			    out.println("<script>");
			    out.println("alert('用户名不能为空！');");
			    out.println("history.back();");
			    out.println("</script>");
			    RequestDispatcher  rd = req.getRequestDispatcher("regist.jsp");  
				rd.forward(req, resp);
		}
		
		
		
	}
}
