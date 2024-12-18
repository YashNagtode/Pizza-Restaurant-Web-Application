package com.sunbeam.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunbeam.entities.Customer;
import com.sunbeam.entities.Item;
import com.sunbeam.models.Credentials;
import com.sunbeam.services.LoginService;

import antlr.collections.List;

@Controller
public class LoginController {
	@Autowired
	private LoginService customerService;

	@RequestMapping("/index")
	public String showLogin() {
		return "index";
	}

	@RequestMapping("/login")
	public String autheticate(Credentials cr, HttpSession session) {
		Customer customer = customerService.athenticate(cr);
		if (customer == null) {
			return "failed";
		} else {
			session.setAttribute("user", customer.getName());
			
			if (customer.getName().equalsIgnoreCase("admin")) {
				return "redirect:orders";
			} else {
				
//				session.setAttribute("cart", cart);
				return "redirect:menu";
			}
		}

	}

	@GetMapping("/register")
	public String newuser(Model model) {
		Customer customer = new Customer(0, "", "", "", "", "");
		model.addAttribute("cust", customer);
		return "newuser";
	}

	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("cust") Customer cust, BindingResult res, Model model) {
		System.out.println("New Customer -> " + cust);
		if (res.hasErrors()) { // if any validation errors found, return back to original page
			System.out.println("Validation Errors: " + res);
			return "newuser";
		}
		try {
			int count = customerService.saveUser(cust);
			model.addAttribute("message", "Customer Registered.");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "Customer Registration Failed.");
		}
		return "newuser";
	}
}
