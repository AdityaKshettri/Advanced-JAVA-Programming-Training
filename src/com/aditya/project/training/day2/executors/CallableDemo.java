package com.aditya.project.training.day2.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);

        Future<Integer> future = service.submit(() -> 1234);

        try {
            int ans = future.get();
            System.out.println("Ans = " + ans);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }
}
