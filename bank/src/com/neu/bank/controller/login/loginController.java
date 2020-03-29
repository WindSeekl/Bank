package com.neu.bank.controller.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.bank.service.login.loginService;
import com.neu.bank.service.login.impl.loginServiceImpl;
@WebServlet("/logins")
public class loginController extends HttpServlet{
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
	String uName=req.getParameter("UserName");
	String uPass=req.getParameter("UserPassWord");
	if (uName!="") {
		if (uPass!="") {
			System.out.println("用户名："+uName+",密码："+uPass);
			HttpSession session = req.getSession(); 
			loginService LgS=new loginServiceImpl();
			String JG=LgS.getUserinfoPO(uName, uPass);
			if (JG=="可以登陆") {
				req.setAttribute("name", uName);
				req.setAttribute("PassWord", uPass);
			    resp.setContentType("text/html; charset=UTF-8"); //转码
			    PrintWriter out = resp.getWriter();
			    out.flush();
			    out.println("<script>");
			    out.println("alert('登陆成功');");
			    out.println("history.back();");
			    out.println("</script>");
				RequestDispatcher  rd = req.getRequestDispatcher("index.jsp");  
				rd.forward(req, resp);
			} else {
			    resp.setContentType("text/html; charset=UTF-8"); //转码
			    PrintWriter out = resp.getWriter();
			    out.flush();
			    out.println("<script>");
			    out.println("alert('登陆失败,不存在此用户');");
			    out.println("history.back();");
			    out.println("</script>");
				RequestDispatcher  rd = req.getRequestDispatcher("login.jsp");  
				rd.forward(req, resp);

			};
		} else {
			//判空
			   resp.setContentType("text/html; charset=UTF-8"); //转码
			    PrintWriter out = resp.getWriter();
			    out.flush();
			    out.println("<script>");
			    out.println("alert('密码不能为空！');");
			    out.println("history.back();");
			    out.println("</script>");
			    RequestDispatcher  rd = req.getRequestDispatcher("login.jsp");  
				rd.forward(req, resp);
		}
		
	} else{
		//判空
		   resp.setContentType("text/html; charset=UTF-8"); //转码
		    PrintWriter out = resp.getWriter();
		    out.flush();
		    out.println("<script>");
		    out.println("alert('用户名不能为空！');");
		    out.println("history.back();");
		    out.println("</script>");
		    RequestDispatcher  rd = req.getRequestDispatcher("login.jsp");  
			rd.forward(req, resp);
	}
	
}


}
