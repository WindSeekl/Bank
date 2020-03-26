package com.neu.bank.service.creditCard;

public interface CreditService {
	String queryPass(String cardId, String newPass1, String newPass2, String oldPass, String mark);
	String activateCard(String cardId, String queryPass, String alterPass, String mark);
}
