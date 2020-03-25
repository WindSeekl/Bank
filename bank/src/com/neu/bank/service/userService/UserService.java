package com.neu.bank.service.userService;

public interface UserService {
	String changeUserName(String oldName, String newName);//改用户名
	String changeUserPass(String userName, String oldPass,String newPass1,String newPass2);//改用户密码
}
