package com.aditya.project.training.day3.jdbc.test;

import com.aditya.project.training.day3.jdbc.Customer;
import com.aditya.project.training.day3.jdbc.CustomerDao;
import com.aditya.project.training.day3.jdbc.CustomerDaoImpl;

public class TestAddCustomer {

    public static void main(String[] args) {

        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = new Customer(2, "Kshettri", "Gkp", 9982779405L);
        int added = customerDao.addCustomer(customer);
        if (added>0) {
            System.out.println("Record inserted...");
        } else {
            System.out.println("Record NOT inserted...");
        }
    }
}
