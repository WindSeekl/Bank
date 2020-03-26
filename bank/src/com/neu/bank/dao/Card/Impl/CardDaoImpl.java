package com.neu.bank.dao.Card.Impl;

import java.util.List;

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
	public List<Card> queryId(String obUserId){
		// TODO Auto-generated method stub
		return bd.querySome("select * from card where obUserId='"+obUserId+"'",Card.class);
	}
	
	@Override
	public void updateState(String cardId, int state) {
		// TODO Auto-generated method stub
		bd.inUpDel("update card set State = '"+state+"' where cardId = '"+cardId+"'");
	}

}
