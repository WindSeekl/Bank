package com.neu.bank.service.impl;

import com.neu.bank.dao.CreditCardDao;
import com.neu.bank.dao.impl.CreditCardDaoImpl;
import com.neu.bank.service.CreditService;

public class CreditServiceImpl implements CreditService {

	private CreditCardDao ccd = new CreditCardDaoImpl();
	
	@Override
	public String queryPass(String cardId, String newPass, String oldPass) {
		// TODO Auto-generated method stub
		if(newPass.equals(oldPass)) {
			ccd.queryPass(cardId, newPass);
			return "修改成功";
		}
		else
			return "新密码和旧密码不同";
	}

}
