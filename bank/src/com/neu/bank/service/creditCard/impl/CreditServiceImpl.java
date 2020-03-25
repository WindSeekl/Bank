package com.neu.bank.service.creditCard.impl;

import com.neu.bank.dao.creditCard.CreditCardDao;
import com.neu.bank.dao.creditCard.impl.CreditCardDaoImpl;
import com.neu.bank.po.CreditCard;
import com.neu.bank.service.creditCard.CreditService;

public class CreditServiceImpl implements CreditService {

	private CreditCardDao ccd = new CreditCardDaoImpl();
	
	@Override
	public String queryPass(String cardId, String newPass1, String newPass2, String oldPass, String mark) {
		// TODO Auto-generated method stub
		CreditCard cc = ccd.creditInfo(cardId);
		if(cc.getQueryPass().equals(oldPass)) {
			if(newPass1.equals(newPass2)) {
				ccd.updatePass(cardId, newPass1, mark);
				return "修改成功";
			}else
				return "两次密码不一致";
		}
		else
			return "旧密码错误";
	}

}
