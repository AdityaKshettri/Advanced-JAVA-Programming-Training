package com.aditya.project.training.day1.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {

    void display();

    default void default_method() {

    }

    static void static_method() {

    }
}
