package com.example.expenseIV;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExpenseRepository extends JpaRepository<Expense, Long> {
  // Add custom query methods if needed
}
