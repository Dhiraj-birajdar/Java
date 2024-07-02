package com.tka.misc;


public class ObjectCreationFlow {
    static
    {
        try {
            throw new Exception("static exception");
        } catch (Exception e) {
            System.out.println("exception caugth");
        }
        if(false)
        throw new RuntimeException("static exception");
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        B b = new B();
        try {

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            throw new RuntimeException("finally execption");
        }
    }
}


class A {

    private static int getStaticVarA() {
        System.out.println("class A static Var initialization");
        return 2;
    }

    private int getInstanceVarA() {
        System.out.println("class A instance Var initialization");
        return 1;
    }
    static {

        System.out.println("class A static block");
    }

    {
        System.out.println("class A instance block");
    }
    int instanceVarA = getInstanceVarA();
    static int staticVarA = getStaticVarA();

    A() {
        System.out.println("class A cunstructor");
    }
}

class B extends A {
    int instanceVarB = getInstanceVarB();
    static int staticVarB = getStaticVarB();

    private static int getStaticVarB() {
        System.out.println("class B static Var initialization");
        return 2;
    }

    private int getInstanceVarB() {
        System.out.println("class B instance Var initialization");
        return 1;
    }

    static {

        System.out.println("class B static block");
    }

    {
        System.out.println("class B instance block");
    }
    B() {
        System.out.println("class B cunstructor");
    }
}
