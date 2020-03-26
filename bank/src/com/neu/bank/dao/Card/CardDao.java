package com.neu.bank.dao.Card;

import com.neu.bank.po.Card;

public interface CardDao {
	Card queryInfo(String cardId);
	void updatePass(String cardId, String password);
	Card queryId();
}
