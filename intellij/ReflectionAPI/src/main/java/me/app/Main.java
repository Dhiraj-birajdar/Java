package me.app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        for(Method m: Object.class.getMethods()){
            System.out.println(m.getName());
        }
        System.err.println(Object.class.getMethods().length);
        System.err.println(String.class.getMethods().length);
    }
}