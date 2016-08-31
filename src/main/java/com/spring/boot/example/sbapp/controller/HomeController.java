package com.spring.boot.example.sbapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring MVC Controller class
 *
 */
@RestController
public class HomeController {
	@RequestMapping("/")
	public String getHomePage() {
		return "Hello Spring BOOT World!!";
	}
	
	
}
