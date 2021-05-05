package com.aditya.project.training.day1.inheritance;

public interface MyStaticInterface {

    void display();

    default void add(int x, int y) {
        System.out.println("Default Add in MyStaticInterface = " + (x+y));
    }

    static int calculate(int x, int y) {
        System.out.println("I am static");
        return x + y;
    }

    static void main(String[] args) {
        System.out.println("Main func in MyStaticInterface called");
        int ans = MyStaticInterface.calculate(1,2);
        System.out.println("Add = " + ans);
    }
}
