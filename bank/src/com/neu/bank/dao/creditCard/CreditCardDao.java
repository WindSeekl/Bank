package com.neu.bank.dao.creditCard;

import java.util.List;

import com.neu.bank.po.Card;
import com.neu.bank.po.CreditBill;
import com.neu.bank.po.CreditCard;
import com.neu.bank.po.CreditLimit;

public interface CreditCardDao {
	CreditCard creditInfo(String cardId);
	
	CreditLimit queryLimit(String cardId);
	
	void updatePass(String cardId, String pass, String mark);
	
	void activateCard(String cardId, String mark);
	
	List<CreditBill> queryBill(String cardId, String beginTime, String endTime, String mark);
	
	void setLimit(String cardId, double limit);
	
	Card cardInfo(String cardId);
}
