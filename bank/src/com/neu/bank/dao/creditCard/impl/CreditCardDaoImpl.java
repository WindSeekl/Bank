package com.neu.bank.dao.creditCard.impl;

import java.util.List;

import com.neu.bank.dao.creditCard.CreditCardDao;
import com.neu.bank.po.CreditCard;
import com.neu.bank.po.CreditLimit;
import com.neu.bank.po.Card;
import com.neu.bank.po.CreditBill;
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
	@Override
	public void activateCard(String cardId, String mark) {
		// TODO Auto-generated method stub
		if(mark.equals("active"))
			bd.inUpDel("update creditcard set state = " + 0 + " where cardId ='" + cardId + "'");
		else if(mark.equals("report"))
			bd.inUpDel("update creditcard set state = " + 1 + " where cardId ='" + cardId + "'");
	}
	@Override
	public List<CreditBill> queryBill(String cardId, String beginTime, String endTime, String mark) {
		// TODO Auto-generated method stub
		if(mark.equals("already"))
			return bd.querySome("select * from creditBill where cardId = '" + cardId + "' and beginTime < '" + beginTime + "'", CreditBill.class);
		else
			return bd.querySome("select * from creditBill where cardId = '" + cardId + "' and beginTime > now()", CreditBill.class);
	}
	@Override
	public CreditLimit queryLimit(String cardId) {
		// TODO Auto-generated method stub
		return bd.queryOne("select c.cardId,(c.remaining - b.backremain) usableRemaining,c.remaining,c.maxRemaining,c.integral from creditCard c inner join backhistory b on c.cardId = b.cardId where c.cardId='"+ cardId +"'", CreditLimit.class);
	}
	@Override
	public void setLimit(String cardId, double limit) {
		// TODO Auto-generated method stub
		bd.inUpDel("update creditCard set remaining = " + limit + " where cardId='"+ cardId +"'");
	}
	@Override
	public Card cardInfo(String cardId) {
		// TODO Auto-generated method stub
		return bd.queryOne("select * from Card where cardId='"+ cardId +"'", Card.class);
	}


}
