package com.neu.bank.dao;

import com.neu.bank.po.CreditCard;

public interface CreditCardDao {
	CreditCard creditInfo(String cardId);
	void queryPass(String cardId, String pass);
}
