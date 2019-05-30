package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Harsha {




	@GetMapping("/hello")
	public String hello() {
		return "hello abhay";
	}
	@GetMapping("/add")
	public int add() {
		int a=20,b=30;
		int c=a+b;
		return c;
	}
	@GetMapping("/sub")
	public int sub() {
		int a=10;int b=5;
		int c=a-b;
		return c;
	}
	@GetMapping("/div")
	public float div() {
		float a=2.0f,b=2.3f;
		float c=a/b;
		return c;
	}

}


