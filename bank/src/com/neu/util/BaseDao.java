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

/*优化basedao:
 *1.提供查询一条数据的方法,注意代码重复率的问题
 *2.添加增,删,改的方法
 *
 *消化
 * 
 */
public class BaseDao implements AutoCloseable{
	private Connection con = null;
	public <T> List<T> querySome(String sql,Class<T> clazz){
		Statement state = null;
		ResultSet rs = null;
		//存储结果对象的容器
		List<T> list = new ArrayList<T>();
		//T类型的属性列表
		Field[] fieldArr = clazz.getDeclaredFields();
		try {
			con = DBUtil.getSqlConnection();
			state = con.createStatement();
			rs = state.executeQuery(sql);
			while(rs.next()){
				//实例化对象
				T t = clazz.newInstance();
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
			DBUtil.closeSqlSource(state,rs,con);
		}
		return list;
	}
	public <T> T queryOne(String sql,Class<T> clazz){
		Statement state = null;
		ResultSet rs = null;
		//存储结果对象
		T t = null;
		try {
			con = DBUtil.getSqlConnection();
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
			DBUtil.closeSqlSource(state,rs,con);
		}
		return t;
	}
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
	
	public void inUpDel(String sql){
		Statement state = null;
		con = DBUtil.getSqlConnection();
		try {
			state = con.createStatement();
			state.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeSqlSource(state);
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
	//关闭baseDao
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		if(con!=null){
			DBUtil.closeSqlSource(con);;
		}
	}
	
}
