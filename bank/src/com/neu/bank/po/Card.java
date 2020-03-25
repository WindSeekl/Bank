package com.neu.bank.po;

public class Card {
	private String cardId;
	private String password;
	private String certificateType; //证件类型
	private String certificateNum;  //证件号码
	private String FixPhone;        //电话号码
	private String sex;
	private String phoneNum;
	private String adress;
	private String postCode;        //邮政编码
	private String email;
	private int networkId;          //开户行
	private int cardTypeId;         //卡类型
	private boolean isSigned;       //是否签约
	private String alias;           //别名
	private boolean state;          //状态
	private int obUserId;           //网银编号
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	public String getCertificateNum() {
		return certificateNum;
	}
	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}
	public String getFixPhone() {
		return FixPhone;
	}
	public void setFixPhone(String fixPhone) {
		FixPhone = fixPhone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(int sex) {
		if(sex == 0)
			this.sex = "男";
		else if(sex == 1)
			this.sex = "女";

	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNetworkId() {
		return networkId;
	}
	public void setNetworkId(int networkId) {
		this.networkId = networkId;
	}
	public int getCardTypeId() {
		return cardTypeId;
	}
	public void setCardTypeId(int cardTypeId) {
		this.cardTypeId = cardTypeId;
	}
	public boolean isSigned() {
		return isSigned;
	}
	public void setSigned(int isSigned) {
		if(isSigned == 0)
			this.isSigned = true;
		else if(isSigned == 1)
			this.isSigned = false;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public boolean isState() {
		return state;
	}
	public void setState(int state) {
		if(state == 0)
			this.state = true;
		else if(state == 1)
			this.state = false;
	}
	public int getObUserId() {
		return obUserId;
	}
	public void setObUserId(int obUserId) {
		this.obUserId = obUserId;
	}
	
}
