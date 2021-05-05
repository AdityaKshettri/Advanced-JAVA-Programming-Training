package com.aditya.project.training.day1.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<Integer> data = new HashSet<>();
        data.add(10);
        data.add(20);
        data.add(10);
        data.add(30);
        System.out.println("ArrayList size : " + data.size());
        System.out.println(data);
        data.remove(20);
        System.out.println("After removing 20 by value : " + data);

        System.out.println("Using iterator :");
        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }

        int sum = 0;
        iterator = data.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            sum += integer;
        }
        System.out.println("Sum : " + sum);
        data.forEach(System.out::println);
    }
}
