package com.example.expenseIV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

  @Autowired
  private ExpenseService expenseService;

  @GetMapping
  public List<Expense> getAllExpenses() {
    return expenseService.getAllExpenses();
  }

  @GetMapping("/{id}")
  public Expense getExpenseById(@PathVariable Long id) {
    return expenseService.getExpenseById(id);
  }

  @PostMapping
  public Expense addExpense(@RequestBody Expense expense) {
    return expenseService.saveExpense(expense);
  }

  @PutMapping("/{id}")
  public Expense updateExpense(@PathVariable Long id, @RequestBody Expense updatedExpense) {
    updatedExpense.setId(id);
    return expenseService.saveExpense(updatedExpense);
  }

  @DeleteMapping("/{id}")
  public void deleteExpense(@PathVariable Long id) {
    expenseService.deleteExpense(id);
  }
}
