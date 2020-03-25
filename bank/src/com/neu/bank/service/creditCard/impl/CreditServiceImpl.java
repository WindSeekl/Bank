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
		if(mark.equals("qPass")?cc.getQueryPass().equals(oldPass):cc.getAlterPass().equals(oldPass)) {
			if(newPass1.equals(newPass2)) {
				ccd.updatePass(cardId, newPass1, mark);
				return "修改成功";
			}else
				return "两次密码不一致";
		}
		else
			return "旧密码错误";
	}

	@Override
	public String activateCard(String cardId, String queryPass, String alterPass, String mark) {
		// TODO Auto-generated method stub
		CreditCard cc = ccd.creditInfo(cardId);
		if(cc.getQueryPass().equals(queryPass) && cc.getAlterPass().equals(alterPass)) {
			if(mark.equals("active")?cc.getState() == 1:cc.getState() == 0) {
				ccd.activateCard(cardId, mark);
				return mark.equals("active")?"激活成功":"挂失成功";
			}else
				return mark.equals("active")?"此卡无需激活":"此卡已挂失";
		}
		return "交易密码或查询密码错误";
	}

}
