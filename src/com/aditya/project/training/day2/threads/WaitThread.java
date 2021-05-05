package com.aditya.project.training.day2.threads;

public class WaitThread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Begin : " + Thread.currentThread().getName());

        NotifyThread thread = new NotifyThread(12, 12);
        thread.start();

        synchronized (thread) {
            thread.wait();
            System.out.println(thread.total);
        }

        System.out.println("Main ends");
    }
}
