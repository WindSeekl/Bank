package com.neu.bank.service.userService.impl;

import com.neu.bank.dao.user.UserDao;
import com.neu.bank.dao.user.impl.UserDaoImpl;
import com.neu.bank.service.userService.UserService;

public class UserServiceImpl implements UserService{
	private UserDao ud = new UserDaoImpl();
	@Override
	public String changeUserName(String oldName, String newName) {
		// TODO Auto-generated method stub
		return ud.changeUserName(oldName, newName)==true?"修改成功":"修改失败";
	}
	@Override
	public String changeUserPass(String userName, String oldPass,String newPass) {
		// TODO Auto-generated method stub
		String res;
		if(oldPass.equals(newPass)){
			res=ud.changeUserPass(userName, newPass)==true?"修改成功":"修改失败";
		}else{
			res="两次密码不一致";
		}
		return res;
	}
}
