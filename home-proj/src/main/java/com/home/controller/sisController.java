package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/sister") // class level request mapping
public class sisController {
	
//	when using view resolver no need of @ResponseBody
	@RequestMapping("/makeup")
	public String getMakeup() {
		return "Makeup";
	}
	
	@RequestMapping("/book")
	public String getBooks() {
		return "Book";
	}
}
