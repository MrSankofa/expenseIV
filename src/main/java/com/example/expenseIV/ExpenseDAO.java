package com.example.expenseIV;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenseDAO {

  public void addExpense(String name, double amount, int due, String account, String budget, String budgetInitials) {
    String sql = "INSERT INTO expenses (name, amount, due, account, budget, budget_initials) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection connection = DatabaseUtil.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {
      System.out.println("Connected to Database: Adding Record");
      statement.setString(1, name);
      statement.setDouble(2, amount);
      statement.setInt(3, due);
      statement.setString(4, account);
      statement.setString(5, budget);
      statement.setString(6, budgetInitials);

      int rowsInserted = statement.executeUpdate();
      if (rowsInserted > 0) {
        System.out.println("Expense record inserted successfully.");
      } else {
        System.out.println("Failed to insert expense record.");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

