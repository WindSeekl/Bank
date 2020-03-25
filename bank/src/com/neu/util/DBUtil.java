package com.neu.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
	private static ComboPooledDataSource source = new ComboPooledDataSource("mysql-config");
	//获取链接
	public static Connection getConnection(){
		Connection con = null;
		try {
			con =  source.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	//关闭资源
	public static void closeDbSource(AutoCloseable...close){
		for (AutoCloseable c : close) {
			try {
				c.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
