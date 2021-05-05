package com.aditya.project.training.day1.inheritance;

public class MyInterfaceImpl_1 implements MyInterface, MyInterface1 {

    @Override
    public void display() {
        add(2, 3);
    }

    @Override
    public void add(int x, int y) {
        int ans = x + y + 10;
        System.out.println("Overriding Ans = " + ans);
    }

    @Override
    public void show() {
        System.out.println("Show Ans = " + sub(4, 1));
    }

    @Override
    public int sub(int x, int y) {
        return x-y-10;
    }

    public static void main(String[] args) {
        MyInterfaceImpl_1 ob = new MyInterfaceImpl_1();
        ob.display();
        ob.show();
    }
}
