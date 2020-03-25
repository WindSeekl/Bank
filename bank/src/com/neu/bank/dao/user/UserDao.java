package com.neu.bank.dao.user;

public interface UserDao {
	boolean changeUserName(String oldName, String newName);//改用户名
	boolean changeUserPass(String userName, String userPass);//改用户密码
}
