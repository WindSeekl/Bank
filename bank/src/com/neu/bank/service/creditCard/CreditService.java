package com.neu.bank.service.creditCard;

import java.util.List;

import com.neu.bank.po.CreditBill;
import com.neu.bank.po.CreditLimit;

public interface CreditService {
	String queryPass(String cardId, String newPass1, String newPass2, String oldPass, String mark);
	String activateCard(String cardId, String queryPass, String alterPass, String mark);
	List<CreditBill> queryBill(String cardId, String beginTime, String endTime, String mark, String queryPass);
	CreditLimit queryLimit(String cardId, String password);
	String setLimit(String cardId,double limit);
	String queryProcess(String cardId, String password);
}
