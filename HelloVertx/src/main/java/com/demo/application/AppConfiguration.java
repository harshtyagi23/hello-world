package com.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfiguration {

	@Autowired
	Environment environment;

	int httpPort() {
		return environment.getProperty("http.port", Integer.class, 8080);
	}
}