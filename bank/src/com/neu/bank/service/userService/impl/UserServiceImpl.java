package com.neu.bank.service.userService.impl;

import com.neu.bank.dao.user.UserDao;
import com.neu.bank.dao.user.impl.UserDaoImpl;
import com.neu.bank.po.User;
import com.neu.bank.service.userService.UserService;

public class UserServiceImpl implements UserService{
	private UserDao ud = new UserDaoImpl();
	@Override
	public String changeUserName(String oldName, String newName) {
		// TODO Auto-generated method stub
		return ud.changeUserName(oldName, newName)==true?"修改成功":"修改失败";
	}
	@Override
	public String changeUserPass(String userName, String oldPass,String newPass1,String newPass2) {
		// TODO Auto-generated method stub
		User u = ud.queryOne(userName);
		String res;
		if(newPass1.equals(newPass2)){
			System.out.println(u.getUserPass());
			System.out.println(oldPass);
			if(u.getUserPass().equals(oldPass)){
				res=ud.changeUserPass(userName, newPass1)==true?"修改成功":"修改失败";
			}else{
				res= "原密码输入错误";
			}
		}else{
			res="两次密码不一致";
		}
		return res;
	}
}
