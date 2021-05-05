package com.aditya.project.training.day3.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public int addCustomer(Customer customer) {
        int inserted = 0;
        String query = "INSERT INTO customer VALUES(?,?,?,?)";
        try (PreparedStatement ps = new MyConnection().getConnection().prepareStatement(query)) {
            ps.setInt(1, customer.getCustomerId());
            ps.setString(2, customer.getCustomerName());
            ps.setString(3, customer.getAddress());
            ps.setLong(4, customer.getContact());
            inserted = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return inserted;
    }

    @Override
    public boolean updateCustomerName(int customerId, String customerName) {
        boolean updated = false;
        String query = "UPDATE customer SET name=? WHERE id=?";
        try (PreparedStatement ps = new MyConnection().getConnection().prepareStatement(query)) {
            ps.setString(1, customerName);
            ps.setInt(2, customerId);
            int changed = ps.executeUpdate();
            if (changed>0) {
                updated = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updated;
    }

    @Override
    public Customer findCustomerById(int customerId) {
        Customer customer = new Customer();
        String query = "SELECT * FROM customer WHERE id=?";
        try (PreparedStatement ps = new MyConnection().getConnection().prepareStatement(query)) {
            ps.setInt(1, customerId);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String address = resultSet.getString(3);
                long contact = resultSet.getLong(4);
                customer = new Customer(id, name, address, contact);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM customer";
        try (PreparedStatement ps = new MyConnection().getConnection().prepareStatement(query)) {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String address = resultSet.getString(3);
                long contact = resultSet.getLong(4);
                Customer customer = new Customer(id, name, address, contact);
                customers.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customers;
    }

    @Override
    public List<Customer> findAllCustomersByAddress(String customerAddress) {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM customer WHERE address=?";
        try (PreparedStatement ps = new MyConnection().getConnection().prepareStatement(query)) {
            ps.setString(1, customerAddress);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String address = resultSet.getString(3);
                long contact = resultSet.getLong(4);
                Customer customer = new Customer(id, name, address, contact);
                customers.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customers;
    }

    @Override
    public int deleteCustomer(int customerId) {
        int deleted = 0;
        String query = "DELETE FROM customer WHERE id=?";
        try (PreparedStatement ps = new MyConnection().getConnection().prepareStatement(query)) {
            ps.setInt(1, customerId);
            deleted = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return deleted;
    }
}
