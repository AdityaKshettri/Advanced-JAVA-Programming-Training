package com.aditya.project.training.day3.jdbc;

public class Customer {

    private int customerId;
    private String customerName;
    private String address;
    private long contact;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String address, long contact) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.contact = contact;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                '}';
    }
}
