package jdbcpk;
import java.sql.*;

public class DB {
	static Connection c = null;
	public static boolean connect(String url, String user, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);;
		}
		return c!=null;
	}
	
	public static ResultSet selectAll(String table) {
		ResultSet rs = null;
		try{
			PreparedStatement ps = c.prepareStatement("select * from "+table);
//			ps.setString(1, table); // ? placeholder can be used for values only not for identifiers like table, field
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println("query error: "+e);
		}		
		return rs;
	}
	
	public static int addRow(String name, double marks, String grade) {
		int r=0;
		try(PreparedStatement ps = c.prepareStatement("insert into student(name, marks, grade) values(? , ? , ?)");){
			ps.setString(1, name);
			ps.setDouble(2, marks);
			ps.setString(3, grade);
			r = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("addRow : "+ e);
		}
		return r;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws SQLException {
		// Database connection
		boolean isConnected = DB.connect("jdbc:mysql://localhost:3306/College", "root", "root");
		System.out.println("Connection success? : "+isConnected);
		
		// select query
		ResultSet rs = DB.selectAll("student");
		System.out.println("Query success? : "+(rs!=null));
		
		// insert query
//		int ra = DB.addRow("Ram", 75,"B");
//		System.out.println("Rows affected: "+ra);
		System.out.println(rs.getType());
		
		
		try {
			if(rs.next())
				System.out.println(rs.getRow());
		} catch (SQLException e) {
			System.out.println("Main error: "+e);
		}
		
		
		try {
			if(c!=null)c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
