package com.neu.bank.controller.login;

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
	if(!uName.isEmpty()&&!uPass.isEmpty()) {
		HttpSession session = req.getSession(); 
		loginService LgS=new loginServiceImpl();
		int i=LgS.getUserinfoPO(uName, uPass);
		StringBuilder sb = new StringBuilder("{");
		sb.append("\"resArr\":");
		sb.append("[");	
		if (i==1) {
			session.setAttribute("name", uName);
			session.setAttribute("PassWord", uPass);
		    resp.setContentType("text/html; charset=UTF-8"); //转码
		    System.out.println(uName+","+uPass);
		    sb.append("\""+uName+"\""+",");
			sb.append("\""+uPass+"\"");
		    sb.append("]}");
		    resp.setContentType("application/json;charset=utf-8");
			resp.getWriter().println(sb.toString());
			
		} else {
			resp.getWriter().println("登陆成功");
		}
	} else {
		resp.getWriter().println("用户名或密码不能为空");
	}
	
	
	
	
	}
	
	




}



