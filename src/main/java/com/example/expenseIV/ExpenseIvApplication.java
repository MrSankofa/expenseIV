package com.example.expenseIV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseIvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseIvApplication.class, args);
		ExpenseDAO dao = new ExpenseDAO();
		dao.addExpense("codingNomad", 29.00, 13, "CapitalOne", "Personal Budget", "PB");
	}

}
