package com.neu.bank.service.userService;

import com.neu.bank.po.User;

public interface UserService {
	User queryUser(String name);//查询用户
	String changeUserName(String oldName, String newName);//改用户名
	String changeUserPass(String userName, String oldPass,String newPass1,String newPass2);//改用户密码
	String queryMess(String name);//查询预留信息
	String updateMess(String name,String mess);//修改预留信息
}
