package com.demo.spring.aws.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/message")
	public String getMessage() {
		return "Hello Welcome to AWS!!!";
	}
}
