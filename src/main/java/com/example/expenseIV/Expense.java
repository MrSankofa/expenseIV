package com.example.expenseIV;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private BigDecimal amount;

  @Column(nullable = false)
  private LocalDate dateDue;

  @Column(nullable = false)
  private String account;

  // Constructors, getters, and setters

  public Expense(Long id, String name, BigDecimal amount, LocalDate dateDue, String account) {
    this.id = id;
    this.name = name;
    this.amount = amount;
    this.dateDue = dateDue;
    this.account = account;
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

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public LocalDate getDateDue() {
    return dateDue;
  }

  public void setDateDue(LocalDate dateDue) {
    this.dateDue = dateDue;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }
}

