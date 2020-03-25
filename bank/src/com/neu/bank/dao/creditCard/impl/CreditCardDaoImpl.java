package com.neu.bank.dao.creditCard.impl;

import com.neu.bank.dao.creditCard.CreditCardDao;
import com.neu.bank.po.CreditCard;
import com.neu.util.BaseDao;

public class CreditCardDaoImpl implements CreditCardDao{

	private BaseDao bd = new BaseDao();

	@Override
	public CreditCard creditInfo(String cardId) {
		// TODO Auto-generated method stub
		return bd.queryOne("select * from creditcard where cardId = '" + cardId + "'", CreditCard.class);
	}
	@Override
	public void updatePass(String cardId, String pass, String mark) {
		// TODO Auto-generated method stub
		if(mark.equals("qPass"))
			bd.inUpDel("update creditcard set queryPass = '" + pass + "' where cardId ='" + cardId + "'");
		else if(mark.equals("aPass"))
			bd.inUpDel("update creditcard set alterPass = '" + pass + "' where cardId ='" + cardId + "'");
	}


}
