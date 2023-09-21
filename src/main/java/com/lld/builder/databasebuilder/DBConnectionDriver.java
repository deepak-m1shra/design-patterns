package com.lld.builder.databasebuilder;

public class DBConnectionDriver {

    public static void main(String[] args) {

        DatabaseConnection connection = new DatabaseConnection.DatabaseConnectionBuilder()
                .withHost("http://msql")
                .withPort("3306")
                .withUsername("deepua")
                .withPassword("scotttiger")
                .build();

        System.out.println(connection);
    }
}
