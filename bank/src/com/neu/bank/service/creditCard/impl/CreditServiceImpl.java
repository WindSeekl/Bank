package com.neu.bank.service.creditCard.impl;

import java.util.Arrays;
import java.util.List;

import com.neu.bank.dao.creditCard.CreditCardDao;
import com.neu.bank.dao.creditCard.impl.CreditCardDaoImpl;
import com.neu.bank.po.Card;
import com.neu.bank.po.CreditBill;
import com.neu.bank.po.CreditCard;
import com.neu.bank.po.CreditLimit;
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

	@Override
	public List<CreditBill> queryBill(String cardId, String beginTime, String endTime, String mark, String queryPass) {
		// TODO Auto-generated method stub
		CreditCard cc = ccd.creditInfo(cardId);
		if(cc.getQueryPass().equals(queryPass))
			return ccd.queryBill(cardId, beginTime, endTime, mark);
		else
			return null;
	}

	@Override
	public CreditLimit queryLimit(String cardId, String password) {
		// TODO Auto-generated method stub
		CreditCard cc = ccd.creditInfo(cardId);
		if(cc.getQueryPass().equals(password))
			return ccd.queryLimit(cardId);
		else
			return null;
	}

	@Override
	public String setLimit(String cardId, double limit) {
		// TODO Auto-generated method stub
		CreditCard cc = ccd.creditInfo(cardId);
		if(cc.getMaxRemaining() > limit) {
			ccd.setLimit(cardId, limit);
			return "设置成功";
		}
		return "失败 额度不足";
	}

	@Override
	public String queryProcess(String cardId, String password) {
		// TODO Auto-generated method stub
		CreditCard cc = ccd.creditInfo(cardId);
		if(cc.getQueryPass().equals(password)) {
			Card card = ccd.cardInfo(cardId);
			if(card.getCertificateNum()  != null)
				return "申请成功";
			else
				return "请上传身份证信息";
		}
		return "密码错误";
	}

}
