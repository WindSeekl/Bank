package com.neu.bank.po;

public class Card {
	private String cardId;
	private String password;
	private String certificateType; //证件类型
	private String certificateNum;  //证件号码
	private String FixPhone;        //电话号码
	private int sex;
	private String phoneNum;
	private String address;
	private String postCode;        //邮政编码
	private String e_mail;
	private String networkId;          //开户行
	private String cardTypeId;         //卡类型
	private int isSigned;       //是否签约
	private String alias;           //别名
	private int state;          //状态
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
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	public String getCardTypeId() {
		return cardTypeId;
	}
	public void setCardTypeId(String cardTypeId) {
		this.cardTypeId = cardTypeId;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * @return the e_mail
	 */
	public String getE_mail() {
		return e_mail;
	}
	/**
	 * @param e_mail the e_mail to set
	 */
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	/**
	 * @param sex the sex to set
	 */
	/**
	 * @return the sex
	 */
	public String getSex() {
		String res;
		if(sex==0){
			res="男";
		}else{
			res="女";
		}
		return res;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public boolean getIsSigned() {
		boolean b;
		if(isSigned==0){
			b=false;
		}else{
			b=true;
		}
		return b;
	}

	public void setIsSigned(int isSigned) {
		this.isSigned = isSigned;
	}
	/**
	 * @return the state
	 */
	public boolean getState() {
		boolean b;
		if(state==0){
			b=true;
		}else{
			b=false;
		}
		return b;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * @return the obUserId
	 */
	public int getObUserId() {
		return obUserId;
	}
	/**
	 * @param obUserId the obUserId to set
	 */
	public void setObUserId(int obUserId) {
		this.obUserId = obUserId;
	}
	
}
