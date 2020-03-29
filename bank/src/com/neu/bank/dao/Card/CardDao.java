package com.neu.bank.dao.Card;

import java.util.List;

import com.neu.bank.po.Card;

public interface CardDao {
	Card queryInfo(String cardId);
	void updatePass(String cardId, String password);
	List<Card> queryId(String obUserId);//查询同一网银账户下的卡
	void updateState(String cardId ,int state);//挂失状态
	
}
