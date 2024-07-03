package com.example.ITBthops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruit")
public class Thopsitb {
	@GetMapping
	public String getrequest() {
		return "Apple";
	}
}