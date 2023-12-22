package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {
	@PostMapping("/raja/1")
	public int sum(@RequestParam int x,@RequestParam int y) {
		int sum=x+y;
		return sum;
	
	}

}
