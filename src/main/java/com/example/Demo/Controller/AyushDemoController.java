package com.example.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AyushDemoController {

	@GetMapping("/name")
	public String getMessage() {
		return "Ayush Sirohi";
	}
}
