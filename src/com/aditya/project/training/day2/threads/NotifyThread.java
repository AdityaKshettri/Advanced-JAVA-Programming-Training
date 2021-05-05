package com.aditya.project.training.day2.threads;

public class NotifyThread extends Thread {

    public static int total = 0;
    int x, y;

    public NotifyThread(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println("Name : " + Thread.currentThread().getName());

        synchronized (this) {
            total = x + y;
            notify();
        }
    }
}
