package com.aditya.project.training.day1.inheritance;

public class MyInterfaceImpl_2 implements MyInterface, MyInterface2 {

    @Override
    public void display() {
        System.out.println("Display");
    }

    @Override
    public void add(int x, int y) {
        System.out.println("Answer : " + (x+y+30));
        MyInterface.super.add(x, y);
        MyInterface2.super.add(x, y);
    }

    public static void main(String[] args) {
        MyInterfaceImpl_2 ob = new MyInterfaceImpl_2();
        ob.display();
        ob.add(3, 4);
    }
}
