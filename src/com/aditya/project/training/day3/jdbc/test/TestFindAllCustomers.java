package com.aditya.project.training.day3.jdbc.test;

import com.aditya.project.training.day3.jdbc.Customer;
import com.aditya.project.training.day3.jdbc.CustomerDao;
import com.aditya.project.training.day3.jdbc.CustomerDaoImpl;

import java.util.List;

public class TestFindAllCustomers {

    public static void main(String[] args) {

        CustomerDao customerDao = new CustomerDaoImpl();
        List<Customer> customers = customerDao.findAllCustomers();
        if (customers.size() > 0) {
            System.out.println(customers);
        } else {
            System.out.println("Not found!");
        }
    }
}
