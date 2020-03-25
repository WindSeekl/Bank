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
		if(mark.equals("changeName")){
			System.out.println("进入了");
			String name = request.getParameter("name");
			res = us.changeUserName("张", name);
		}else{
			
		}
		String jsonstr = JSONObject.toJSONString(res);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().println(jsonstr);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
