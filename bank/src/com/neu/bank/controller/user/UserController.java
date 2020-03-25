package com.neu.bank.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.neu.bank.service.userService.UserService;
import com.neu.bank.service.userService.impl.UserServiceImpl;

/**
 * Servlet implementation class ChangeNameController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private UserService us = new UserServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String mark = request.getParameter("mark");
		String res = null;
		String jsonstr;
		if(mark.equals("changeName")){
			String name = request.getParameter("name");
			res = us.changeUserName("张三", name);
			jsonstr = JSONObject.toJSONString(res);
		}else if(mark.equals("changePass")){
			String oldpass=request.getParameter("oldpass");
			String newpass1=request.getParameter("newpass1");
			String newpass2=request.getParameter("newpass2");
			res = us.changeUserPass("王五", oldpass, newpass1,newpass2);
			jsonstr = JSONObject.toJSONString(res);
		}else if(mark.equals("changeMess")){
			String mess=request.getParameter("mess");
			if(mess.length()<=8){
				res = us.updateMess("王五", mess);
			}else{
				res = "超过长度限制";
			}
			jsonstr = JSONObject.toJSONString(res);
		}else{
			jsonstr = JSONObject.toJSONString(us.queryUser("王五"));
		}
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().println(jsonstr);
		//"王五"替换为seison
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
