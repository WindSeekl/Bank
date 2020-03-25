package com.neu.bank.service.impl;

import com.neu.bank.dao.CreditCardDao;
import com.neu.bank.dao.impl.CreditCardDaoImpl;
import com.neu.bank.po.CreditCard;
import com.neu.bank.service.CreditService;

public class CreditServiceImpl implements CreditService {

	private CreditCardDao ccd = new CreditCardDaoImpl();
	
	@Override
	public String queryPass(String cardId, String newPass1, String newPass2, String oldPass) {
		// TODO Auto-generated method stub
		CreditCard cc = ccd.creditInfo(cardId);
		if(cc.getQueryPass().equals(oldPass)) {
			if(newPass1.equals(newPass2)) {
				ccd.queryPass(cardId, newPass1);
				return "修改成功";
			}else
				return "两次密码不一致";
		}
		else
			return "旧密码错误";
	}

}
