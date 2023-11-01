package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class momController {
	
	// Returns welcome-page
	@RequestMapping("/cafe")
	public String showWelcomePage() {
		return "welcome-page";
	}
	
	@RequestMapping("processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		// Handle the data received from the user
		String userEnteredValue = request.getParameter("foodType");
		// Adding the captured value to the model
		model.addAttribute("userInput", userEnteredValue);
		// set the data with the model object and send it to the view
		return "process-order";
	}

}
