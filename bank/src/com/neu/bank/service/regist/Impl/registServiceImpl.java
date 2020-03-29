package com.neu.bank.service.regist.Impl;

import com.neu.bank.dao.regist.registDao;
import com.neu.bank.dao.regist.Impl.registDaoImpl;
import com.neu.bank.po.UserinfoPO;
import com.neu.bank.service.regist.registService;

public class registServiceImpl implements registService{
	registDao RS=new registDaoImpl();
	@Override
	public String regist(String UserName, String UserPass) {
		// TODO Auto-generated method stub
		String cg="注册成功";
		String sb="注册失败";
		UserinfoPO UIFP=RS.getUserinfoPOByNameAndPass(UserName, UserPass);
		if (UIFP==null) {
			RS.addUserinfo(UserName, UserPass);
			
			return cg;
		} else {
			return sb;
		}
		
	}

}
