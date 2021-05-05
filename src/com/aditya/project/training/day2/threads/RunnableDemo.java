package com.aditya.project.training.day2.threads;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Beginning of Main : " + Thread.currentThread().getName());

        Runnable r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();

        System.out.println("End of Main : " + Thread.currentThread().getName());
    }
}
