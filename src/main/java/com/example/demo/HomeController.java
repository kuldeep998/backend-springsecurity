package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		return "welcome to default url";
	}

	@GetMapping(value = "/admin")
	public String admin() {
		return "welcome to admin url";
	}

	@GetMapping(value = "/user")
	public String user() {
		return "welcome to user url";
	}
}
