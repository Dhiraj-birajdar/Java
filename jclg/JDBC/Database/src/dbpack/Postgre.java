package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class Postgre {
    public Connection pgConnect(String dbName, String user, String pass){
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName, user, pass);
            if(con != null){
                System.out.println("connected");
            }else {
                System.out.println("connection Failed");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
}
