package com.jwt.example.jwt.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.jwt.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	UserService userService;
	@GetMapping("/user")
	public String getUsers() {
		return userService.getUser().toString();
	}
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
}
