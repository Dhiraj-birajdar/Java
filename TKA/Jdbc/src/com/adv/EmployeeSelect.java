package com.adv;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EmployeeSelect {
	public static void main(String[] args) throws Exception {

		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			
			System.out.println("Employee Data: \n");
			while (rs.next()) {
				System.out.println("Employee id : "+rs.getInt(1) + "\nDepartment Name : "+rs.getString(2) + "\nEmployee Name : "+rs.getString(3) + "\nHire Date : "+rs.getString(4)+"\n");		
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			con.close();
			st.close();
			System.out.println("Resources Closed");
		}

	}
}
