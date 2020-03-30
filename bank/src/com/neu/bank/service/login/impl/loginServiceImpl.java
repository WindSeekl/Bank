package com.neu.bank.service.login.impl;

import com.neu.bank.dao.login.LoginDao;
import com.neu.bank.dao.login.impl.LoginDaoImpl;
import com.neu.bank.po.UserinfoPO;
import com.neu.bank.service.login.loginService;


public class loginServiceImpl implements loginService{
	LoginDao LD=new LoginDaoImpl();
	@Override
	public int getUserinfoPO(String UserName, String UserPass) {
		// TODO Auto-generated method stub
			int u=0;
		
			UserinfoPO UserP= LD.getUserinfoPOByNameAndPass(UserName, UserPass);
			if (UserP.getUserName().isEmpty()) {
				if (UserP.getUserPass().isEmpty()) {
					u=1;
					return u;
				} 
				else {
					return u;
				}
				
			} else {
				return u;
			}
	
		
		
	}


	

}
