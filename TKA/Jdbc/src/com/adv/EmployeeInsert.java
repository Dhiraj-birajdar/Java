package com.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeInsert {
	public static void main(String[] args) throws Exception {
			
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root","root");
			st = con.createStatement();
			
			int ra = st.executeUpdate("insert into employee (id, deptname, ename, hiredate) values ( 10, 'Finance', 'sam', '2021-05-01')");
			
			if(ra>0)
				System.out.println("Data inserted successfully : "+ra+" rows affected");
			else
				System.out.println("Data not inserted");
			
		}catch(Exception e) {
			System.err.println(e.toString());
		}finally {
			con.close();
			st.close();
			System.out.println("Resources Closed");
		}
	}
}
