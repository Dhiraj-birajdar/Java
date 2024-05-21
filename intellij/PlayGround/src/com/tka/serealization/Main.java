package com.tka.serealization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("sam", 34, 6_000);

        System.out.println(person);
        System.out.println(serialize(person,"person.txt"));

        person = deserialize("person.txt");
        System.out.println(person);

        System.out.println(System.getProperty("java.version"));
        try {
            int i =System.in.read();
            System.out.println(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static Person deserialize(String file) {
        FileInputStream filein = null;
        ObjectInputStream objin = null;

        try {
            filein = new FileInputStream(file);
            objin = new ObjectInputStream(filein);

            return (Person) objin.readObject();
        }catch (Exception e){
            System.err.println(e.toString());
            return null;
        }
    }

    static boolean serialize(Person person,String path){
        FileOutputStream fileout = null;
        ObjectOutputStream objout = null;
        try{
        fileout = new FileOutputStream(path);
        objout = new ObjectOutputStream(fileout);
        objout.writeObject(person);

        fileout.close();
        objout.close();
        return true;
        }catch (Exception e){
            System.err.println(e.toString());
            return false;
        }
    }
}
