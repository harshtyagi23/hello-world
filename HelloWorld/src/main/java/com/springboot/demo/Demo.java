package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class Demo {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo.class, args);
	}

}
