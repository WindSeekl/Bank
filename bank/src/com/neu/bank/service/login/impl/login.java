package com.neu.bank.service.login.impl;

import com.neu.bank.dao.login.getUser;
import com.neu.bank.dao.login.impl.Usersql;
import com.neu.bank.po.UserBean;
import com.neu.bank.service.login.logins;

public class login implements logins{
	getUser GetUser=new Usersql();

	@Override
	public int logins(String Username, String UserPass) {
		// TODO Auto-generated method stub
		int i=0;
		
		UserBean User=GetUser.getUserName(Username, UserPass);
		if (!User.getUserName().equals("")) {
			if (!User.getUserPass().equals("")) {
				i=1;
				System.out.println("账户验证完毕");
			} else {
				System.out.println("密码错误");
			}
		} else {
			System.out.println("用户名不存在");
		}
		return i;
	}
	

}
