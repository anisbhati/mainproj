package com.example.edu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@RequestMapping("/test")
	public String getTest() {
		return "......... running ";
	}

}
