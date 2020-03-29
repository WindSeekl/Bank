package com.neu.bank.po;

public class CreditLimit {
	private String cardId;
	private double usableRemaining;
	private double remaining;
	private double maxRemaining;
	private int integral; 
	public final String getCardId() {
		return cardId;
	}
	public final void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public final double getUsableRemaining() {
		return usableRemaining;
	}
	public final void setUsableRemaining(double usableRemaining) {
		this.usableRemaining = usableRemaining;
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
	public final int getIntegral() {
		return integral;
	}
	public final void setIntegral(int integral) {
		this.integral = integral;
	}
	
}
