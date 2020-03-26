package com.neu.bank.dao.creditCard;

import com.neu.bank.po.CreditCard;

import java.util.List;

import com.neu.bank.po.CreditBill;

public interface CreditCardDao {
	CreditCard creditInfo(String cardId);
	void updatePass(String cardId, String pass, String mark);
	void activateCard(String cardId, String mark);
	List<CreditBill> queryBill(String cardId, String beginTime, String endTime, String mark);
}
