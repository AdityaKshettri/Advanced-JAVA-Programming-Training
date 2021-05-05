package com.aditya.project.training.day3.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoTransaction {

    public static void main(String[] args) {

        Customer customer = new Customer(10, "Kshettri Aditya", "Gkp", 9982779405L);
        int inserted = 0;
        String query = "INSERT INTO customer VALUES(?,?,?,?)";
        Connection connection = new MyConnection().getConnection();
        try {
            connection.setAutoCommit(false);

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, customer.getCustomerId());
            ps.setString(2, customer.getCustomerName());
            ps.setString(3, customer.getAddress());
            ps.setLong(4, customer.getContact());
            inserted = ps.executeUpdate();

            connection.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
