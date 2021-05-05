package com.aditya.project.training.day3.jdbc.test;

import com.aditya.project.training.day3.jdbc.Customer;
import com.aditya.project.training.day3.jdbc.CustomerDao;
import com.aditya.project.training.day3.jdbc.CustomerDaoImpl;

public class TestFindCustomerById {

    public static void main(String[] args) {

        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = customerDao.findCustomerById(1);
        if (customer.getCustomerId()>0) {
            System.out.println(customer);
        } else {
            System.out.println("Not Found!");
        }
    }
}
