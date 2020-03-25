package com.neu.bank.dao.impl;

import com.neu.bank.dao.CreditCardDao;
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
	public void queryPass(String cardId, String pass) {
		// TODO Auto-generated method stub
		bd.inUpDel("update creditcard set queryPass = '" + pass + "' where cardId ='" + cardId + "'");
	}


}
