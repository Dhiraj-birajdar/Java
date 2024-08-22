package com.tka.concurrency;

public class SleepExample {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                System.out.println("Thread is sleeping");
                Thread.sleep(2000);  // Pauses the thread for 2 seconds
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}

