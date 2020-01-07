package com.ngs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	@RequestMapping("/logout-success")
	public String logout() {
		return "logout.jsp";
	}
	
}
