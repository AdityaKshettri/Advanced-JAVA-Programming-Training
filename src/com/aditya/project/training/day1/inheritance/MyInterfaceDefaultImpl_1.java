package com.aditya.project.training.day1.inheritance;

public class MyInterfaceDefaultImpl_1 implements MyInterface, MyInterface1 {

    @Override
    public void display() {
        add(2, 3);
    }

    @Override
    public void show() {
        System.out.println("Show Ans = " + sub(4, 1));
    }

    public static void main(String[] args) {
        MyInterfaceDefaultImpl_1 ob = new MyInterfaceDefaultImpl_1();
        ob.display();
        ob.show();
    }
}
