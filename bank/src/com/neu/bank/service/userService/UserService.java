package com.neu.bank.service.userService;

public interface UserService {
	String changeUserName(String oldName, String newName);//改用户名
	String changeUserPass(String userName, String oldPass,String newPass);//改用户密码
}
