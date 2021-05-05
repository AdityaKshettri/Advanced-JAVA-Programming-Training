package com.aditya.project.training.day1.inheritance;

public class MyInterfaceDefaultImpl implements MyInterface {

    @Override
    public void display() {
        add(2, 3);
    }

    public static void main(String[] args) {
        MyInterfaceDefaultImpl ob = new MyInterfaceDefaultImpl();
        ob.display();
    }
}
