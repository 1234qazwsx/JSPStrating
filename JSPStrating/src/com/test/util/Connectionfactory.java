// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Connectionfactory.java

package com.test.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 通用数据库连接工厂
 */
public class Connectionfactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;

	private static final Connectionfactory factory = new Connectionfactory();
	private Connection conn;

	static {
		Properties prop = new Properties();
		try {
			InputStream in = Connectionfactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			prop.load(in);
		} catch (Exception e) {
			System.out.println("IO读取出错,找不到dbconfig.properties!");
		}

		driver = prop.getProperty("driver");
		dburl = prop.getProperty("dburl", "");
		user = prop.getProperty("user", "");
		password = prop.getProperty("password", "");
	}

	/**
	 * 默认的构造函数
	 */
	private Connectionfactory() {
	}

	/**
	 * 获取一个实例
	 * @return
	 */
	public static Connectionfactory getInstance() {
		return factory;
	}

	/**
	 * 数据库链接工厂
	 *
	 * @return 返回一个数据库链接
	 */
	public Connection makeConnection() {

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			//log.info("加载数据库驱动出现异常！");
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (SQLException e) {
			//log.info("通过JDBC获取数据库连接发生异常！");
			e.printStackTrace();
		}

		return conn;
	}

}
