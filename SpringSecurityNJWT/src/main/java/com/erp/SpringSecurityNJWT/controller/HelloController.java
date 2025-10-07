package com.erp.SpringSecurityNJWT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("/")
	public String  great(HttpServletRequest request) {
		return "Welcome to ERP" +request.getSession().getId();
	}
}
