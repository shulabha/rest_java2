package com.nse.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	private final static String url = "jdbc:edb://172.17.7.108:5443/neapsut";
	private final static String user = "neapsdba";
	private final static String password = "neapsdba123";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.edb.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}
}
