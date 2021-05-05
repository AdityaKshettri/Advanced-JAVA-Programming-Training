package com.aditya.project.training.day3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered...");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?allowPublicKeyRetrieval=true&useSSL=false", "root", "1234");
            System.out.println("Got Connection...");

            String query = "INSERT INTO demo VALUES(1,'ABC')";
            Statement st = connection.createStatement();
            int inserted = st.executeUpdate(query);
            if (inserted>0) {
                System.out.println("Record inserted...");
            } else {
                System.out.println("Sorry...");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
