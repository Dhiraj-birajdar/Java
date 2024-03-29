package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Oracle
{
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loaded");
		}
		catch(Exception e)
		{
			System.out.println("Not Loaded");
		}

	}
	public static void main(String[] args)  throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclshub","scott","tiger");
		Statement statement=con.createStatement();
		ResultSet resultset=statement.executeQuery("select empno,ename from emp");
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1)+"   "+resultset.getString(2));
		}

	}
}
