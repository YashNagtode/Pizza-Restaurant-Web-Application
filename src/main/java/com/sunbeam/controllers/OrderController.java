package com.sunbeam.controllers;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.Order;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sunbeam.entities.Item;
import com.sunbeam.services.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping("/menu")
	public String showMenu(HttpSession session) {
		return "menu";
	}

	@RequestMapping("/veg")
	public String vegMenu(HttpSession session, Model m) {
		List<String> list = orderService.getAllVegCategories();
		for (String string : list) {
			System.out.println(string);
		}
		m.addAttribute("veglist", list);

		String username = (String) session.getAttribute("username");
		// ModelAndView mav = new ModelAndView("veg", "veglist", list);
		return "veg";
	}

	@RequestMapping("/nonveg")
	public String nonvegMenu(HttpSession session, Model m) {
		List<String> list = orderService.getAllNonVegCategories();
		for (String string : list) {
			System.out.println(string);
		}
		m.addAttribute("nonveglist", list);

		String username = (String) session.getAttribute("username");

		return "nonveg";
	}

	@GetMapping("/pizzatype")
	public String getPizzaItems(@RequestParam String category, @RequestParam String type, Model model) { 
		List<Object[]> list = orderService.getAllItems(category, type);
		for (Object[] objects : list) {
			System.out.println(objects);
		}
		model.addAttribute(list);
		return "vegitem";
		
	}
}
