package com.slm.balance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slm.balance.model.domain.entity.Balance.Type;

@Controller
@RequestMapping("user/home")
public class HomeController {
	

	@GetMapping("{type}")
	String incomes(ModelMap model,@PathVariable String type) {
		model.put("title", "incomes".equals(type) ? "Add New Income":"Add New Expense");
		model.put("type", type);
		return "balance-list";
	}
	
	/*
	@GetMapping("expenses")
	String expenses(ModelMap model) {
		model.put("title", "Expense Management");
		return "balance-list";
	}*/
	
	/*
	@GetMapping("incomes")
	String incomes() {
		return "incomes";
	}*/
	
}
