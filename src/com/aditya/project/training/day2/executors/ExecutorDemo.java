package com.aditya.project.training.day2.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

//        service.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread name : " + Thread.currentThread().getName());
//            }
//        });

        service.execute(() -> System.out.println("Thread name : " + Thread.currentThread().getName()));

        service.shutdown();
    }
}
