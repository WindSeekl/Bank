package com.neu.bank.dao.user.impl;

import com.neu.bank.dao.user.UserDao;
import com.neu.util.BaseDao;

public class UserDaoImpl implements UserDao{
	private BaseDao bd = new BaseDao();
	@Override
	public boolean changeUserName(String userId, String userName) {
		// TODO Auto-generated method stub
		return bd.inUpDel("update obuser set username='"+userName+"' where obuserId='"+userId+"'")==1?true:false;
	}
	@Override
	public boolean changeUserPass(String userId, String userPass) {
		// TODO Auto-generated method stub
		return bd.inUpDel("update obuser set userPass='"+userPass+"' where obuserId='"+userId+"'")==1?true:false;
	}

}
