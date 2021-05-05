package com.aditya.project.training.day1.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(20);
        data.add(10);
        data.add(30);
        System.out.println("ArrayList size : " + data.size());
        System.out.println(data);
        data.add(0, 999);
        System.out.println("After adding at 0th index : " + data);
        data.remove(new Integer(20));
        System.out.println("After removing 20 by value : " + data);
        data.remove(2);
        System.out.println("After removing 10 by index 2 : " + data);

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
    }
}
