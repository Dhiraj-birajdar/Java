package com.tka.concurrency;

public class WaitNotifyExample {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread is waiting");
                    lock.wait();  // Waits for notification
                    System.out.println("Thread resumed after notify");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread notifyingThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Notifying thread will notify waiting thread");
                lock.notify();  // Notifies the waiting thread
            }
        });

        waitingThread.start();
        try {
            Thread.sleep(1000);  // Sleep to simulate some work before notifying
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        notifyingThread.start();
    }
}

