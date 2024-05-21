package com.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeCopy {

	public static void main(String[] args) throws Exception {

		Connection conCopy = null;
		Connection conPaste = null;
		Statement stCopy = null;
		Statement stPaste = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conCopy = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
			conPaste = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");

			stCopy = conCopy.createStatement();
			stPaste = conPaste.createStatement();

			ResultSet rs = stCopy.executeQuery("select * from employee");

			while (rs.next()) {
				int eid = rs.getInt(1);
				String deptName = rs.getString(2);
				String eName = rs.getString(3);
				String hireDate = rs.getString(4);
				stPaste.executeUpdate("insert into employeeCopy (id, deptname, ename, hiredate) values ( " + eid
						+ ", \"" + deptName + "\", \"" + eName + "\",\"" + hireDate + "\")");
			}

			rs = stPaste.executeQuery("select * from employeecopy");

			System.out.println("Data copied: ");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4));
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			conCopy.close();
			conPaste.close();
			stCopy.close();
			stPaste.close();
			System.out.println("Resources Closed");
		}

	}

}
