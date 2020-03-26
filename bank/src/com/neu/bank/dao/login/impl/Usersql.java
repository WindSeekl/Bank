package com.neu.bank.dao.login.impl;

import java.util.List;

import com.neu.bank.dao.login.getUser;
import com.neu.bank.po.UserBean;
import com.neu.util.BaseDao;

public class Usersql implements getUser{
	BaseDao basedao=new BaseDao();
	@Override
	public UserBean getUserName(String name, String pass) {
		// TODO Auto-generated method stub
		return basedao.queryOne("SELECT * FROM User WHERE UserName="+name+" and UserPass="+pass+"",UserBean.class);
	}
	
}
