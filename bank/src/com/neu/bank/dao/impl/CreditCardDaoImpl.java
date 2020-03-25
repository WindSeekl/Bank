package com.neu.bank.dao.impl;

import com.neu.bank.dao.CreditCardDao;
import com.neu.util.BaseDao;

public class CreditCardDaoImpl implements CreditCardDao{

	private BaseDao bd = new BaseDao();
	
	@Override
	public void queryPass(String cardId, String pass) {
		// TODO Auto-generated method stub
		bd.inUpDel("update creditcard set querypass = '" + pass + "' where cardId =" + cardId);
	}

}
