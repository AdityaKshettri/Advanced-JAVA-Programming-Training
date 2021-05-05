package com.aditya.project.training.day2.threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Inside run : " + Thread.currentThread().getName());
        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(3000);
                System.out.println("Thread i : " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Beginning of Main : " + Thread.currentThread().getName());

        Thread t = new MyThread();
        t.start();

        System.out.println("End of Main : " + Thread.currentThread().getName());
    }
}
