package com.spring3tiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String printHelloWorld(Model model) {
		model.addAttribute("message", "Hello World!");
		System.out.println("XXX");
		return "home";
	}
}