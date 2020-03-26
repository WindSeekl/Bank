package com.neu.bank.controller.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.bank.service.login.impl.login;
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
			login login=new login();
			int i=login.logins(uName, uPass);
			System.out.println("i值为："+i);
			if (i==0) {
				System.out.println("登陆失败");
				
			} else if(i==1){
				System.out.println("登陆成功");
				
			};
		} else {
			System.out.println("密码不能为空");
		}
		
	} else{
		System.out.println("用户名不能为空");
	}
	
}


}
