package com.aditya.project.training.day1.inheritance;

public interface MyInterface1 {

    void show();

    default int sub(int x, int y) {
        return x-y;
    }
}
