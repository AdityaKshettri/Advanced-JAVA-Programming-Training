package com.aditya.project.training.day3.jdbc.test;

import com.aditya.project.training.day3.jdbc.CustomerDao;
import com.aditya.project.training.day3.jdbc.CustomerDaoImpl;

public class TestUpdateCustomer {

    public static void main(String[] args) {

        CustomerDao customerDao = new CustomerDaoImpl();
        boolean updated = customerDao.updateCustomerName(1, "Adi Ksh");
        if (updated) {
            System.out.println("Record updated...");
        } else {
            System.out.println("Record NOT updated...");
        }
    }
}
