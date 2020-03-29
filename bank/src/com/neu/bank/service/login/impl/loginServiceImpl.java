package com.neu.bank.service.login.impl;

import com.neu.bank.dao.login.LoginDao;
import com.neu.bank.dao.login.impl.LoginDaoImpl;
import com.neu.bank.po.UserinfoPO;
import com.neu.bank.service.login.loginService;


public class loginServiceImpl implements loginService{
	LoginDao LD=new LoginDaoImpl();
	@Override
	public String getUserinfoPO(String UserName, String UserPass) {
		// TODO Auto-generated method stub
		
		try {
			UserinfoPO UserP= LD.getUserinfoPOByNameAndPass(UserName, UserPass);
			if (UserP!=null) {
				return "可以登陆";
			} else {
				return "不存在此用户";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}


	

}
