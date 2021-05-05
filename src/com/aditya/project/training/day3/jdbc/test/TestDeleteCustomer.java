package com.aditya.project.training.day3.jdbc.test;

import com.aditya.project.training.day3.jdbc.CustomerDao;
import com.aditya.project.training.day3.jdbc.CustomerDaoImpl;

public class TestDeleteCustomer {

    public static void main(String[] args) {

        CustomerDao customerDao = new CustomerDaoImpl();
        int deleted = customerDao.deleteCustomer(10);
        if (deleted>0) {
            System.out.println("Record deleted...");
        } else {
            System.out.println("Record not deleted!");
        }
    }
}
