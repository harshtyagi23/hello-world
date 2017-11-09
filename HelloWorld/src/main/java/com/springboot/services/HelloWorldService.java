package com.springboot.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
	
	public String hello() {
		return "Hello, This is test";
	}

}
