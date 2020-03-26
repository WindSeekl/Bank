package com.neu.bank.service.Card;

import java.util.List;

public interface CardService {
	String updatePass(String newpass, String oldPass, String cardId);
	List<String> queryId(String obUserId);//查询同一网银账户下的卡号
}
