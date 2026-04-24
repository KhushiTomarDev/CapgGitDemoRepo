package com.example.ConfigServer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapgDemoController {

	@GetMapping("/name")
	public String getMessage() {
		return "Khushi";
	}
}
