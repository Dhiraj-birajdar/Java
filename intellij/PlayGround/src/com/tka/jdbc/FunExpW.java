package com.tka.jdbc;

import javax.annotation.processing.Filer;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class FunExpW {
public static void main(String[] args) {
//        Connection con = null;
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
                BufferedReader codeReader = new BufferedReader(new FileReader("src/com/tka/jdbc/FunExp.java"));
                BufferedWriter codeWriter = new BufferedWriter(new FileWriter("src/com/tka/jdbc/FunExpW.java"));
        ) {
            List<String> lines = new java.util.ArrayList<>(codeReader.lines().toList());
            String line = lines.get(36);
            int updatedValue = Integer.parseInt(line.substring(line.length()-3,line.length()-1))+50;
            System.out.println(line.matches(".+[\\d]+;")); lines.remove(36);
            lines.add(36,line.replace(line.substring(line.indexOf('=')),"= "+String.valueOf(updatedValue)+";"));
            System.out.println(lines.get(36));
            lines.forEach(s-> {
                try {
                    codeWriter.write(s+"\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            String insertData = "insert into emp(id,first_name,last_name,email,gender,job) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(insertData);
            line = reader.readLine();
            String[] filds;
            System.out.println(line);
            int id = 101;
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

//id,first_name,last_name,email,gender,job

