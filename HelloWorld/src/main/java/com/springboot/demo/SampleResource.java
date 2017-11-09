package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.services.HelloWorldService;

@RestController
public class SampleResource {

	@Autowired
	HelloWorldService helloService;
	
	@RequestMapping("/helloworld")
	public String helloMessage() {
		return helloService.hello();
	}
}
