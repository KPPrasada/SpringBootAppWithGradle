package com.jcombat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcombat.User;

@RestController
@RequestMapping("/test")
public class DemoController {

	@GetMapping
	public String welcome() {
		return "welcome";
	}
	@PostMapping("/login")
	public boolean check(@RequestBody User user)
	{
        if (user.getUsename().equals("user1") && user.getPassword().equals("password1")) {
			
			return true;
		} 
		return false;
	}
}