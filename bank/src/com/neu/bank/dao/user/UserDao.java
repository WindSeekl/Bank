package com.neu.bank.dao.user;

public interface UserDao {
	boolean changeUserName(String userId,String userName);//改用户名
	boolean changeUserPass(String userId,String userPass);//改用户密码
}
