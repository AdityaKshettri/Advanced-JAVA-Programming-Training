package com.aditya.project.training.day1.inheritance;

public interface MyInterface2 {

    void display();

    default void add(int x, int y) {
        int ans = x + y + 20;
        System.out.println("Ans = " + ans);
    }
}
