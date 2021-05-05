package com.aditya.project.training.day2.threads;

public class PriorityDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Inside run : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Beginning of Main : " + Thread.currentThread().getName());

        Thread t = new PriorityDemo();
//        t.setPriority(MAX_PRIORITY);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of Main : " + Thread.currentThread().getName());
    }
}
