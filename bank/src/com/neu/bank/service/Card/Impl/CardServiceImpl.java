package com.neu.bank.service.Card.Impl;

import com.neu.bank.dao.Card.CardDao;
import com.neu.bank.dao.Card.Impl.CardDaoImpl;
import com.neu.bank.po.Card;
import com.neu.bank.service.Card.CardService;

public class CardServiceImpl implements CardService{

	private CardDao cd = new CardDaoImpl();
	
	@Override
	public String updatePass(String password, String oldPass, String cardId) {
		// TODO Auto-generated method stub
		Card card = cd.queryInfo(cardId);
		if(card.getPassword().equals(oldPass)) {
			cd.updatePass(cardId, password);
			return "修改成功";
		}else
			return "旧密码错误";
	}

}
