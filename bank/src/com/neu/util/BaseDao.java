package com.neu.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BaseDao{
	public <T> List<T> querySome(String sql,Class<T> clazz){
		Statement state = null;
		ResultSet rs = null;
		Connection con = DBUtil.getConnection();
		//存储结果对象的容器
		List<T> list = new ArrayList<T>();
		try {
			state = con.createStatement();
			rs = state.executeQuery(sql);
			while(rs.next()){
				//实例化对象
				T t = clazz.newInstance();
				savetoInstance(clazz, rs, t);
				list.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeDbSource(state,rs,con);
		}
		return list;
	}
	//查一个
	public <T> T queryOne(String sql,Class<T> clazz){
		Statement state = null;
		ResultSet rs = null;
		Connection con = DBUtil.getConnection();
		//存储结果对象
		T t = null;
		try {
			state = con.createStatement();
			rs = state.executeQuery(sql);
			t = clazz.newInstance();
			while(rs.next()){
				savetoInstance(clazz, rs, t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeDbSource(state,rs,con);
		}
		return t;
	} 
	//遍历Field数组,将结果集的属性赋值
	public <T> void savetoInstance(Class<T> clazz,ResultSet rs,T t) throws SQLException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Field[] fieldArr = clazz.getDeclaredFields();
		//遍历属性数组
		for (Field field : fieldArr) {
			String fieldName = field.getName();
			//从结果集中获取对应的字段值
			Object fieldValue = rs.getObject(fieldName);
			if(fieldValue!=null){
				//获取该属性的set方法名
				String setMethodName = getMethodName(fieldName);
				Method me = clazz.getDeclaredMethod(setMethodName,field.getType());
				//赋值到对象
				me.invoke(t,fieldValue);
			}
		}
	}
	//根据属性名,拼装set方法的方法名
	public String getMethodName(String fieldName){
		StringBuilder sb = new StringBuilder("set");
		//添加属性大写的首字母
		sb.append(String.valueOf(fieldName.charAt(0)).toUpperCase());
		//添加属性名剩下的部分
		sb.append(fieldName.substring(1));
		return sb.toString();
	}
	//插入,修改,删除
	public void inUpDell(String sql){
		Connection con = DBUtil.getConnection();
		Statement state = null;
		try {
			state = con.createStatement();
			state.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeDbSource(state,con);
		}
	}
	public int inUpDel(String sql){
		Connection con = DBUtil.getConnection();
		Statement state = null;
		int i = 0;
		try {
			state = con.createStatement();
			i = state.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeDbSource(state,con);
		}
		return i;
	}
}
