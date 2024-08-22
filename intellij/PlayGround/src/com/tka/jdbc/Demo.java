package com.tka.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {
    public static void main(String[] args) {
        Connection con = null;
        try{
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//id,first_name,last_name,email,gender,job