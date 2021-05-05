package com.aditya.project.training.day1.method;

import java.util.function.Predicate;

public class PredicateDemoMethodReference {

    public static boolean isEven(int a) {
        return a%2==0;
    }

    public static void main(String[] args) {

        Predicate<Integer> predicate = (value) -> isEven(value);
        System.out.println("Result = " + predicate.test(3));

        Predicate<Integer> predicate1 = PredicateDemoMethodReference::isEven;
        System.out.println("Result : " + predicate1.test(3));
    }
}
