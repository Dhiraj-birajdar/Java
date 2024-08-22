package com.tka.concurrency;

import java.io.IOException;

public class ThreadClass extends Thread{

    public ThreadClass(String test) {
        super(test);
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (ArithmeticException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName()+" is terminating.......");
    }
}
