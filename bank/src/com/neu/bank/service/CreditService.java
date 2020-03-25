package com.neu.bank.service;

public interface CreditService {
	String queryPass(String cardId, String newPass1, String newPass2, String oldPass);
}
