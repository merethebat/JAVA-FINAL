package dao;

import db.DBConnection;
import model.User;

import java.sql.*;

public class UserDAO {

    public void registerUser(User user) {
        String sql = "INSERT INTO users(username, password, role) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.password);
            stmt.setString(3, user.getRole());
            stmt.executeUpdate();

            System.out.println("User registered");

        } catch (Exception e) {
            System.out.println("Error registering user");
        }
    }

    public User login(String username, String password) {
        String sql = "SELECT * FROM users WHERE username=?";

        try (Connection conn = DBConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String hashed = rs.getString("password");

                if (util.PasswordUtil.checkPassword(password, hashed)) {
                    return new User(username, hashed, rs.getString("role"));
                }
            }

        } catch (Exception e) {
            System.out.println("Login error");
        }
        return null;
    }
}