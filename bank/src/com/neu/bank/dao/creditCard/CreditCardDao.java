package com.neu.bank.dao.creditCard;

import java.util.List;

import com.neu.bank.po.CreditBill;
import com.neu.bank.po.CreditCard;

public interface CreditCardDao {
	//查询卡表信息
	CreditCard creditInfo(String cardId);
	//修改密码
	void updatePass(String cardId, String pass, String mark);
	//更改卡状态
	void activateCard(String cardId, String mark);
	//账单查询
	List<CreditBill> queryBill(String cardId, String beginTime, String endTime, String mark);
}
