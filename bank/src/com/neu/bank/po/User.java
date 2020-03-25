package com.neu.bank.po;

public class User {
	private int obUserId;
	private String userName;
	private String userPassword;
	private String certificateType;
	private String certificateNum;
	private String cealName;
	private String Sex;
	private String phoneNum;
	private String fixPhone;
	private String site;
	private String state;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return obUserId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.obUserId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * @return the certificateType
	 */
	public String getCertificateType() {
		return certificateType;
	}
	/**
	 * @param certificateType the certificateType to set
	 */
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	/**
	 * @return the certificateNum
	 */
	public String getCertificateNum() {
		return certificateNum;
	}
	/**
	 * @param certificateNum the certificateNum to set
	 */
	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}
	/**
	 * @return the cealName
	 */
	public String getCealName() {
		return cealName;
	}
	/**
	 * @param cealName the cealName to set
	 */
	public void setCealName(String cealName) {
		this.cealName = cealName;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return Sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		Sex = sex;
	}
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * @return the fixPhone
	 */
	public String getFixPhone() {
		return fixPhone;
	}
	/**
	 * @param fixPhone the fixPhone to set
	 */
	public void setFixPhone(String fixPhone) {
		this.fixPhone = fixPhone;
	}
	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}
	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + obUserId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", certificateType=" + certificateType + ", certificateNum=" + certificateNum + ", cealName="
				+ cealName + ", Sex=" + Sex + ", phoneNum=" + phoneNum + ", fixPhone=" + fixPhone + ", site=" + site
				+ ", state=" + state + "]";
	}
}
