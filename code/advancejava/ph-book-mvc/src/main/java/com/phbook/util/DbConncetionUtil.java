package com.phbook.util;

import java.sql.Connection;
import java.sql.DriverManager;

public final class DbConncetionUtil {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/fsd19jan";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static final Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static final  void closeConnection(Connection con) {
		try {
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
