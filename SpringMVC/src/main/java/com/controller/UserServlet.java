package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserServlet {

	private final CustomerController customerController;

	UserServlet(CustomerController customerController) {
		this.customerController = customerController;
	}

//	@RequestMapping("/")
//	public String indexPage(HttpServletRequest request) {
//		request.setAttribute("num", 123);
//		request.setAttribute("name", "user1");
//		return "index";
//	}

	@RequestMapping("/")
	public String indexPage(Model m) {
		m.addAttribute("num", 123);
		m.addAttribute("name", "java");
		List list = List.of("c", "java", "c++", "python");
		m.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}
}
