package student;

import java.io.*;

public class Test extends{
    static void m1(String s){
        System.out.println("string");
    }
    static void m1(Object s){
        System.out.println("object");
    }
//    static void m1(Test s){
//        System.out.println("test");
//    }
    public static void main(String[] args) throws FileNotFoundException {

//        Test.m1(null);
//        System.out.println(System.getProperty("java.version"));
//        Object[] o = {1,1.3, 'h', true, "hekl"};
//        for (Object object : o) System.out.println(object + " : " + object.getClass());
//        System.out.println(0/0.0);
        String s = new String(new int[]{65, 66, 67}, 1, 2);
        System.out.println(s);
        for(byte b: s.getBytes()) System.out.println(b);
        FileOutputStream ow = new FileOutputStream("file.txt");
        ObjectOutputStream
    }
}
