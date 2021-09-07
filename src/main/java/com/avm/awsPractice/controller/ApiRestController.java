package com.avm.awsPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

	@GetMapping(value="/testGetMethod")
	public String testGetMethodGet() {
		return "this is the test Get api";
	}
}
