package com.aditya.project.training.day1.inheritance;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void display() {
        add(2, 3);
    }

    @Override
    public void add(int x, int y) {
        int ans = x + y + 10;
        System.out.println("Overriding Ans = " + ans);
    }

    public static void main(String[] args) {
        MyInterfaceImpl ob = new MyInterfaceImpl();
        ob.display();
    }
}
