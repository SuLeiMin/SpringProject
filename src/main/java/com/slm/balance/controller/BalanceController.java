package com.slm.balance.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slm.balance.model.domain.entity.Balance.Type;

@Controller
@RequestMapping("user/balance")
public class BalanceController {

	@GetMapping("add/{type}")
    public String addNew(@PathVariable String type,ModelMap model) {
		model.put("title","incomes".equals(type) ? "Add New Income":"Add New Expense");
		model.put("type", type);
        return "balance-edit";
    }

	@GetMapping("edit/{id}")
    public String edit(@PathVariable int id,ModelMap model) {
		model.put("title", "Edit Income");
		model.put("type", "incomes");
        return "balance-edit";
    }

	@PostMapping("")
    public String save() {
       
        return "redirect:/user/balance/%d".formatted(1);
    }

    @GetMapping("{id}")
    public String findByid(@PathVariable  int id) {
        System.out.println("Balance ID  : %d".formatted(id));
        return "balance-details";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id) {
    	return "redirect:/";
    }
    
    public String search(Type type, String category, LocalDate from, LocalDate to) {
        // TODO implement here
        return "";
    }



}