package com.aditya.project.training.day3.jdbc;

import java.util.List;

public interface CustomerDao {

    int addCustomer(Customer customer);
    boolean updateCustomerName(int customerId, String customerName);
    Customer findCustomerById(int customerId);
    List<Customer> findAllCustomers();
    List<Customer> findAllCustomersByAddress(String address);
    int deleteCustomer(int customerId);
}
