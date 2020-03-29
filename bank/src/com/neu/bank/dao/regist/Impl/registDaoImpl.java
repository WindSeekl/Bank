package com.neu.bank.dao.regist.Impl;

import com.neu.bank.dao.regist.registDao;
import com.neu.bank.po.UserinfoPO;
import com.neu.util.BaseDao;

public class registDaoImpl implements registDao {

	BaseDao basedao =new BaseDao();
@Override
public UserinfoPO getUserinfoPOByNameAndPass(String UserName, String UserPass) {
// TODO Auto-generated method stub
return basedao.queryOne("SELECT * FROM User WHERE UserName="+UserName+" and UserPass="+UserPass+"", UserinfoPO.class);
}

@Override
public int addUserinfo(String UserName, String UserPass) {
// TODO Auto-generated method stub
return basedao.inUpDel("insert into loginuser values("+UserName+","+UserPass+");");
}


}
