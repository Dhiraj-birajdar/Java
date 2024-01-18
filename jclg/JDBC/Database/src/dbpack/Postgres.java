/**
 * @Author Dhiraj Birajdar
 * @version 1.0
 * @since 2024
 */
package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * class for postgres database connection
 */
public class Postgres {
    /**
     * @value null default value
     */
    Connection con = null;

    /**
     *
     * @param dbName  database name
     * @param user  username
     * @param pass  password of user
     * @return returns connection reference variable
     * @throws Exception throws sql exception
     */
    public Connection pgConnect(String dbName, String user, String pass)throws Exception{
//        Connection con = null;
//        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName, user, pass);
            if(con != null){
                System.out.println("connected");
            }else {
                System.out.println("connection Failed");
            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
        return con;
    }
}
