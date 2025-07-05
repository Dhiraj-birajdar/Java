package com.tka.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.UUID;

public class CsvToDB {
    public static void main(String[] args) {
        // Connection con = null;
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                BufferedReader reader = new BufferedReader(new FileReader("data.csv"))) {

            // String createTable = "create table emp(id int primary key, first_name
            // varchar(50), last_name varchar(50), email varchar" +
            // "(50), gender char, job varchar(50))";
            // Statement st = con.createStatement();
            // st.execute(createTable);
            // st.close();

            String insertData = "insert into emp(id,first_name,last_name,email,gender,job) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(insertData);
            String line = reader.readLine();

            String[] filds;
            System.out.println(line);
            int id = 51;
            while ((line = reader.readLine()) != null) {
                filds = line.split(",");
                pst.setInt(1, id++);
                pst.setString(2, filds[1]);
                pst.setString(3, filds[2]);
                pst.setString(4, filds[3]);
                pst.setString(5, filds[4]);
                pst.setString(6, filds[5]);
                System.out.println(pst.executeUpdate());
            }
            pst.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing App......");
        }
    }
}

// id,first_name,last_name,email,gender,job
