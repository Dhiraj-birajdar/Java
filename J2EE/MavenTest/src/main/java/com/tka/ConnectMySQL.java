package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("java.version")); 
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root","root");
			
			if(con != null) 
				System.out.println("Database Connected Successfully");
			else
				System.out.println("Database conection failed...");
			 
		}catch(Exception e) {
			
			System.err.println(e.toString());
			
		}finally {
			
			con.close();
			System.out.println("Resources Closed");
		}
	}
}
