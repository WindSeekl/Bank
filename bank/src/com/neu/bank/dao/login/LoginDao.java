package com.neu.bank.dao.login;

import com.neu.bank.po.UserinfoPO;

public interface LoginDao {
	
	public UserinfoPO getUserinfoPOByNameAndPass(String UserName,String UserPass);
	

}
