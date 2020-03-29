package com.neu.bank.po;

public class CreditCard {
	private String cardId;
	private String queryPass;
	private String alterPass;
	private double remaining;
	private double maxRemaining;
	private int integral;            //积分
	private int state;			 //挂失
	private int schedule; 		 //进度
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
	public final int getState() {
		return state;
	}
	public final void setState(int state) {
		this.state = state;
	}
	public final int getSchedule() {
		return schedule;
	}
	public final void setSchedule(int schedule) {
		this.schedule = schedule;
	}
	public final double getRemaining() {
		return remaining;
	}
	public final void setRemaining(double remaining) {
		this.remaining = remaining;
	}
	public final double getMaxRemaining() {
		return maxRemaining;
	}
	public final void setMaxRemaining(double maxRemaining) {
		this.maxRemaining = maxRemaining;
	}
	@Override
	public String toString() {
		return "CreditCard [cardId=" + cardId + ", queryPass=" + queryPass + ", alterPass=" + alterPass + ", remaining="
				+ remaining + ", maxRemaining=" + maxRemaining + ", integral=" + integral + ", state=" + state
				+ ", schedule=" + schedule + "]";
	}
	
	
}
