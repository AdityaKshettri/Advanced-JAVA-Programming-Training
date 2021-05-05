package com.aditya.project.training.day1.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEmployeeDemo {

    public static void main(String[] args) {

        Map<String, Employee> employees = new ConcurrentHashMap<>();
        employees.put("a", new Employee());
        employees.put("b", new Employee(1, "Adi", 5000));
        employees.put("c", new Employee(2, "Aditya", 5000));

        System.out.println(employees);
        System.out.println(employees.size());

        employees.put("a", new Employee(3, "Ksh", 3000));

        System.out.println("After overriding value for key 'a'");
        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println("--- USING ITERATOR ---");
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("--- KEYS ---");
        employees.keySet().forEach(System.out::println);

        System.out.println("--- VALUES ---");
        employees.values().forEach(System.out::println);

        System.out.println("--- KEY-VALUE ---");
        employees.forEach((key, value) -> System.out.println(key + " : " + value));

        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            // Both create & update possible here
            employees.put("a", new Employee(1, "Adi", 5000));
            employees.put("d", new Employee(1, "Adi", 5000));
        }
    }
}
