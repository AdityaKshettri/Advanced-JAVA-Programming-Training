package com.aditya.project.training.day3.jdbc;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoMetadata {

    public static void main(String[] args) {

        String query = "SELECT * FROM customer";
        try (Statement statement=new MyConnection().getConnection()
                .createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = statement.executeQuery(query);

            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            System.out.println("Result has " + cols + " columns");

            for (int i=1;i<=cols;i++) {
                System.out.println(rsmd.getColumnName(i) + " : " + rsmd.getColumnType(i) + " : " + rsmd.getColumnTypeName(i));
            }

            DatabaseMetaData databaseMetaData = new MyConnection().getConnection().getMetaData();
            System.out.println("Driver name : " + databaseMetaData.getDriverName());
            System.out.println("Driver name : " + databaseMetaData.getDriverVersion());
            System.out.println("Driver name : " + databaseMetaData.getDatabaseProductName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
