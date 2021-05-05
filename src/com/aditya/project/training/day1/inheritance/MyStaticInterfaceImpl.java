package com.aditya.project.training.day1.inheritance;

public class MyStaticInterfaceImpl implements MyStaticInterface {

    @Override
    public void display() {
        System.out.println("Display");
        MyStaticInterface.calculate(2, 3);
    }

    static int calculate(int x, int y) {
        System.out.println("I am static and in Impl class");
        return x + y;
    }

    public static void main(String[] args) {
        MyStaticInterfaceImpl ob = new MyStaticInterfaceImpl();
        ob.display();
        ob.add(2,3);
        calculate(2, 3);
    }
}
