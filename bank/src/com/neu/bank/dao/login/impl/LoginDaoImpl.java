package com.neu.bank.dao.login.impl;

import com.neu.bank.dao.login.LoginDao;
import com.neu.bank.po.UserinfoPO;
import com.neu.util.BaseDao;

public class LoginDaoImpl implements LoginDao{
	BaseDao basedao=new BaseDao();

	@Override
	public UserinfoPO getUserinfoPOByNameAndPass(String UserName, String UserPass){
		// TODO Auto-generated method stub
	 return basedao.queryOne("SELECT * FROM loginuser WHERE UserName='"+UserName+"' and UserPass='"+UserPass+"'", UserinfoPO.class);
	}

	
}
