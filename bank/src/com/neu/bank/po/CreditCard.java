package com.neu.bank.po;

public class CreditCard {
	private String cardId;
	private String queryPass;
	private String alterPass;
	private int integral;            //积分
	private boolean state;			 //挂失
	private boolean schedule; 		 //进度
	public final String getCardId() {
		return cardId;
	}
	public final void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public final String getQueryPass() {
		return queryPass;
	}
	public final void setQueryPass(String queryPass) {
		this.queryPass = queryPass;
	}
	public final String getAlterPass() {
		return alterPass;
	}
	public final void setAlterPass(String alterPass) {
		this.alterPass = alterPass;
	}
	public final int getIntegral() {
		return integral;
	}
	public final void setIntegral(int integral) {
		this.integral = integral;
	}
	public final boolean isState() {
		return state;
	}
	public final void setState(int state) {
		if(state == 0)
			this.state = true;
		else if(state == 1)
			this.state = false;
	}
	public final boolean isSchedule() {
		return schedule;
	}
	public final void setSchedule(int schedule) {
		if(schedule == 0)
			this.schedule = true;
		else if(schedule == 1)
			this.schedule = false;
	}
	
	
}
