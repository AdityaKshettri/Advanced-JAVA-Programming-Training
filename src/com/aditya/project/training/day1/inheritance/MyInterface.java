package com.aditya.project.training.day1.inheritance;

public interface MyInterface {

    void display();

    default void add(int x, int y) {
        int ans = x + y;
        System.out.println("Ans = " + ans);
    }
}
