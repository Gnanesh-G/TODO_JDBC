package com.codewithgnanesh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String connectionurl="jdbc:mysql://localhost:3306/demo";
    private static final String username="root";
    private static final String password="root";
    public static Connection getConnection(){
            Connection connection ;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(connectionurl,username,password);
            System.out.println("Connection"+!connection.isClosed());

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }



}
