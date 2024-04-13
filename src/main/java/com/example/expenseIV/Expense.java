package com.example.expenseIV;

import jakarta.persistence.*;


@Entity
@Table(name = "expenses")
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private double amount;

  @Column(nullable = false)
  private int due;

  @Column(nullable = false)
  private String account;

  @Column(nullable = false)
  private String budget;

  @Column(nullable = false)
  private String budgetInitials;

  // Constructors, getters, and setters

  public String getBudget() {
    return budget;
  }

  public void setBudget(String budget) {
    this.budget = budget;
  }

  public String getBudgetInitials() {
    return budgetInitials;
  }

  public void setBudgetInitials(String budgetInitials) {
    this.budgetInitials = budgetInitials;
  }

  public Expense() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public int getDue() {
    return due;
  }

  public void setDue(int dateDue) {
    this.due = dateDue;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }
}

