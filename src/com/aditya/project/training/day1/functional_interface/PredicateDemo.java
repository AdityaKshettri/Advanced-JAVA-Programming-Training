package com.aditya.project.training.day1.functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("SG12345");
            }
        };
        System.out.println("--- PREDICATE 1 ---");
        System.out.println(predicate.test("sg12345"));
        System.out.println(predicate.test("SG12345"));

        Predicate<String> predicate1 = s -> s.length()>5;
        System.out.println("--- PREDICATE 2 ---");
        System.out.println(predicate1.test("sg123"));
        System.out.println(predicate1.test("SG12345"));

        Predicate<String> predicate2 = predicate.and(predicate1);
        System.out.println("--- PREDICATE AND ---");
        System.out.println(predicate2.test("sg123"));
        System.out.println(predicate2.test("SG12345"));

        Predicate<String> predicate3 = predicate.or(predicate1);
        System.out.println("--- PREDICATE OR ---");
        System.out.println(predicate3.test("sg123"));
        System.out.println(predicate3.test("SG12345"));
    }
}
