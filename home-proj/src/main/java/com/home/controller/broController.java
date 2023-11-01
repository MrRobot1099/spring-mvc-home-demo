package com.home.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class broController {

//	@ResponseBody
	@RequestMapping("/cricketbat")
	public String getBat() {
		return "MRFCricketbat";
		
	}
}
