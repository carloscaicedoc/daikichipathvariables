package com.carloscaicedo.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/daikichi")
public class APIController {
	
	// Routes with Path Variables
	@RequestMapping("/travel/{city}")
	public String showCity(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	
	@RequestMapping("/lotto/{number}")
	public String displayMessage(@PathVariable("number") Integer number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be way of tempting offers.";
		} else {
			return "You have enjoyed the fruit of your labor but now is great time to spend time with family and friends.";
		}
	}	
	
	
	// Routes with Request Mapping
	@RequestMapping("")
	public String welcome_page() {
		return "Welcome to Daikichi. Wonderful thinkgs are about to come for you";
	}
		
	@RequestMapping("/today")
	public String today_page() {
		return "Today is a great day to catch up on assigments and perhaps even to get ahead!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow_page() {
		return "Tomorrow will bring some deserve time with family, "
				+ "as well as some rest. And Tomorrow you'll have some time to code as well.!";
	}
	
	@GetMapping("/days_later")
	public String week_later_page() {
		return "In a few days you'll start a new live. Enjoy!";
	}
	

}


