package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
	static ResultSet getData() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
			st = con.createStatement();
			rs = st.executeQuery("select * from employee");
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			try {
				con.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
}
