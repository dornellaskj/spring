package com.kevind.SpringMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevind.service.GenericWelcomeService;
import com.kevind.service.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Kevin D'Ornellas");
		
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		return "welcomeNew";
	}
}
