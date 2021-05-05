package com.aditya.project.training.day1.collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpId() - o2.getEmpId();
    }
}
