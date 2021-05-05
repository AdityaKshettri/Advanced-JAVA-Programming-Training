package com.aditya.project.training.day1.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEmployeeDemo {

    public static void main(String[] args) {

        Set<Employee> employees = new TreeSet<>(new EmployeeComparator());
        employees.add(new Employee());
        employees.add(new Employee(1, "Aditya", 10000));
        employees.add(new Employee(2, "Adi", 10000));
        employees.add(new Employee(1, "Aditya", 10000));

        System.out.println(employees);
        System.out.println(employees.size());

        boolean removed = employees.remove(new Employee(1, "Aditya", 10000));
        System.out.println(removed);

        System.out.println(employees);
        System.out.println(employees.size());
    }
}
