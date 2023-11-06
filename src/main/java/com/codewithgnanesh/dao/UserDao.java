package com.codewithgnanesh.dao;

import com.codewithgnanesh.db.DbConnection;
import com.codewithgnanesh.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final Connection log;
    private String selectLoginSQL = "SELECT id,username,password FROM AUTH WHERE username=? and password=?";
    private final static String selectRegisterSQL = "INSERT INTO AUTH (name, email, password) VALUES (?, ?, ?)";

    public UserDao() {
        log=DbConnection.getConnection();
    }

    public User loginUser(String username, String password) {
        User user = null;
        try {
            PreparedStatement ps = log.prepareCall(selectLoginSQL);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public boolean registerUser(String name, String email, String password) {
        try {
            PreparedStatement preparedStatement = log.prepareStatement(selectRegisterSQL);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }



}
