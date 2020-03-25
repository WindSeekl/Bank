package com.neu.bank.dao.user.impl;

import com.neu.bank.dao.user.UserDao;
import com.neu.bank.po.User;
import com.neu.util.BaseDao;

public class UserDaoImpl implements UserDao{
	private BaseDao bd = new BaseDao();
	@Override
	public boolean changeUserName(String oldName, String newName) {
		// TODO Auto-generated method stub
		return bd.inUpDel("update obuser set username='"+newName+"' where userName='"+oldName+"'")==1?true:false;
	}
	@Override
	public boolean changeUserPass(String userName, String userPass) {
		// TODO Auto-generated method stub
		return bd.inUpDel("update obuser set userPass='"+userPass+"' where userName='"+userName+"'")==1?true:false;
	}
	@Override
	public User queryOne(String name) {
		// TODO Auto-generated method stub
		return bd.queryOne("select * from obuser where userName='"+name+"'", User.class);
		
	}
}
