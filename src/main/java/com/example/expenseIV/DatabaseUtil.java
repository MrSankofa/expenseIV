package com.example.expenseIV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/expense_tracker";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "rootroot";

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
  }
}
