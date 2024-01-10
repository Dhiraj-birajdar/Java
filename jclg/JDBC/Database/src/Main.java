import dbpack.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Postgre pg = new Postgre();
        try(Connection con = pg.pgConnect("products","postgres", "root");){
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select brand from cars where year = 1978");
            rs.next();
            System.out.println(rs.getString(1));
        }catch (Exception e){
            System.out.println(e);
        }
        // Integer.
    }
}