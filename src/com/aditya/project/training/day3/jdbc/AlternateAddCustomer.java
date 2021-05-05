package com.aditya.project.training.day3.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlternateAddCustomer {

    public static void main(String[] args) {

        String query = "SELECT * FROM customer";
        try (Statement statement=new MyConnection().getConnection()
                .createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = statement.executeQuery(query);

            rs.moveToInsertRow();
            rs.updateInt(1, 5);
            rs.updateString(2, "Adi");
            rs.updateString(3, "Bangalore");
            rs.updateLong(4, 1234L);
            rs.insertRow();
            rs.beforeFirst();

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                long contact = rs.getLong(4);
                System.out.println(name + " : " + address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
