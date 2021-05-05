package com.aditya.project.training.day1.method;

public class MyClass {

    public int func(int a, int b) {
        return a + b;
    }

    public static int func_static(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        MyMethod m1 = (x, y) -> x + y;
        System.out.println(m1.myMethod(23, 25));

        MyClass myClass = new MyClass();
        MyMethod m2 = (x, y) -> myClass.func(x, y);
        System.out.println(m2.myMethod(23, 25));

        System.out.println("--- USING METHOD REFERENCE ---");
        MyMethod m3 = myClass::func;
        System.out.println(m3.myMethod(23, 25));

        System.out.println("--- USING STATIC METHOD REFERENCE ---");
        MyMethod m4 = MyClass::func_static;
        System.out.println(m4.myMethod(23, 25));
    }
}
