package com.example.springmultiplepropertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Autowired
	private GreetingModel greetingModel;
	
	@GetMapping(value = "/greeting")
	public String showWelcomeMessage() {
		return greetingModel.getWelcomeMessage();
	}
	
	@GetMapping(value = "/bye")
	public String showGoodbyeMessage() {
		return greetingModel.getGoodByeMessage();
	}

}
