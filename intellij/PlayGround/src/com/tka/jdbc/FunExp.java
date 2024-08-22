package com.tka.jdbc;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class FunExp {
    static int id = 1;
    public static void main(String[] args) {
//        Connection con = null;
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
                BufferedReader codeReader = new BufferedReader(new FileReader("src/com/tka/jdbc/FunExp.java"));
        ) {
            List<String> lines = new java.util.ArrayList<>(codeReader.lines().toList());
            int lineNumber = 9;
            String line = lines.get(lineNumber);
            int updatedValue = Integer.parseInt(line.substring(line.lastIndexOf(" "), line.length() - 1).strip()) + 50;
            System.out.println(line.matches(".+[\\d]+;"));
            lines.remove(lineNumber);
            lines.add(lineNumber, line.replace(line.substring(line.indexOf('=')), "= " + String.valueOf(updatedValue) + ";"));
            System.out.println(lines.get(lineNumber));
            BufferedWriter codeWriter = new BufferedWriter(new FileWriter("src/com/tka/jdbc/FunExp.java"));
            lines.forEach(s -> {
                try {
                    codeWriter.write(s + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            codeWriter.close();
            String insertData = "insert into emp(id,first_name,last_name,email,gender,job) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(insertData);
            line = reader.readLine();
            String[] filds;
            System.out.println(line);
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
//            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Closing App......");
        }
    }
}

//id,first_name,last_name,email,gender,job

