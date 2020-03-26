package com.neu.bank.po;

public class UserBean {
	String UserName;
	String UserPass;
	public UserBean(String userName, String userPass) {
		super();
		UserName = userName;
		UserPass = userPass;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPass() {
		return UserPass;
	}
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}
}
