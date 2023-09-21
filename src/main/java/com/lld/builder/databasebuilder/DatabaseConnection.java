package com.lld.builder.databasebuilder;

import javax.xml.crypto.Data;

public class DatabaseConnection {

    private String host;
    private String port;
    private String username;
    private String password;

    private DatabaseConnection(){}

    private DatabaseConnection(String host, String port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public static class DatabaseConnectionBuilder {

        private DatabaseConnection databaseConnection = new DatabaseConnection();

        public DatabaseConnectionBuilder withHost(String host) {
            this.databaseConnection.host = host;
            return this;
        }

        public DatabaseConnectionBuilder withPort(String port) {
            this.databaseConnection.port =port;
            return this;
        }

        public DatabaseConnectionBuilder withUsername(String username) {
            this.databaseConnection.username =username;
            return this;
        }

        public DatabaseConnectionBuilder withPassword(String password) {
            this.databaseConnection.password =password;
            return this;
        }

        public DatabaseConnection build() {
            return new DatabaseConnection(
                    databaseConnection.host,
                    databaseConnection.port,
                    databaseConnection.username,
                    databaseConnection.password
            );

        }
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
