package com.neu.bank.dao.Card.Impl;

import com.neu.bank.dao.Card.CardDao;
import com.neu.bank.po.Card;
import com.neu.util.BaseDao;

public class CardDaoImpl implements CardDao{

	private BaseDao bd = new BaseDao();
	
	@Override
	public void updatePass(String cardId, String password) {
		// TODO Auto-generated method stub
		 bd.inUpDel("update card set PassWord = '" + password + "' where cardId = '" + cardId + "'");
	}

	@Override
	public Card queryInfo(String cardId) {
		// TODO Auto-generated method stub
		return bd.queryOne("select * from card where cardId = '" + cardId + "'", Card.class);
	}

	@Override
	public Card queryId() {
		// TODO Auto-generated method stub
		return bd.queryOne("select cardId from card", Card.class);
	}

}
