package com.slm.balance.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slm.balance.model.domain.entity.User.Role;

@Controller
public class SecurityController {

	@GetMapping("signin")
    public void loadSigin() {
       
    }
	
	@PostMapping("signin")
    public String signin() {
        return "redirect:/";
    }
	
	
	
	@GetMapping("signup")
    public void loadSignUp() {
       
    }
	
	@PostMapping("signup")
    public String signup() {
		return "redirect:/";
    }
	
	
    @GetMapping("signout")
    public String signout() {
    	//TODO Sign out Logics
    	return "redirect:/signin";
    }
    
	
    @PostMapping("user/change-pass")
    public String changePass() {
    	 return "redirect:/";
    }

}