package com.neu.bank.dao.creditCard;

import com.neu.bank.po.CreditCard;

public interface CreditCardDao {
	CreditCard creditInfo(String cardId);
	void updatePass(String cardId, String pass, String mark);
	void activateCard(String cardId, String mark);
}
