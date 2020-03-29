package com.neu.bank.dao.regist;

import com.neu.bank.po.UserinfoPO;

public interface registDao {
public UserinfoPO getUserinfoPOByNameAndPass(String UserName,String UserPass);
	
	public int addUserinfo(String UserName,String UserPass);
}
