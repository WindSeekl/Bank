package com.neu.bank.po;

public class CreditBill {
	private String cbId;
	private String cardId;
	private String beginTime;
	private String endTime;
	private String coinType;
	private String lastDate;
	private double lastRemain;
	private double putSum;
	private double useSum;
	private double consume;
	private double commission;    //手续费
	private double essay;		  //取现
	private double cycleRate;
	private double minBack;
	
	public final String getCbId() {
		return cbId;
	}
	public final void setCbId(String cbId) {
		this.cbId = cbId;
	}
	public final String getCardId() {
		return cardId;
	}
	public final void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public final String getBeginTime() {
		return beginTime;
	}
	public final void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public final String getEndTime() {
		return endTime;
	}
	public final void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public final String getCoinType() {
		return coinType;
	}
	public final void setCoinType(String coinType) {
		this.coinType = coinType;
	}
	public final String getLastDate() {
		return lastDate;
	}
	public final void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public final double getLastRemain() {
		return lastRemain;
	}
	public final void setLastRemain(double lastRemain) {
		this.lastRemain = lastRemain;
	}
	public final double getPutSum() {
		return putSum;
	}
	public final void setPutSum(double putSum) {
		this.putSum = putSum;
	}
	public final double getUseSum() {
		return useSum;
	}
	public final void setUseSum(double useSum) {
		this.useSum = useSum;
	}
	public final double getConsume() {
		return consume;
	}
	public final void setConsume(double consume) {
		this.consume = consume;
	}
	public final double getCommission() {
		return commission;
	}
	public final void setCommission(double commission) {
		this.commission = commission;
	}
	public final double getEssay() {
		return essay;
	}
	public final void setEssay(double essay) {
		this.essay = essay;
	}
	public final double getCycleRate() {
		return cycleRate;
	}
	public final void setCycleRate(double cycleRate) {
		this.cycleRate = cycleRate;
	}
	public final double getMinBack() {
		return minBack;
	}
	public final void setMinBack(double minBack) {
		this.minBack = minBack;
	}
	
	
}

