package com.demo.application;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import io.vertx.core.Vertx;

@SpringBootApplication
@ComponentScan("com.demo")
public class VertxSpringBootDemo {

	@Autowired
	private StaticServer staticServer;

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(VertxSpringBootDemo.class, args);
		new SpringApplicationBuilder(VertxSpringBootDemo.class)
        .web(false).run(args);
	/*	Vertx.vertx()
	      .createHttpServer()
	      .requestHandler(req -> req.response().end("Hello World!"))
	      .listen(8080, handler -> {
	        if (handler.succeeded()) {
	          System.out.println("http://localhost:8080/");
	        } else {
	          System.err.println("Failed to listen on port 8080");
	        }
	      });*/
	}

	@PostConstruct
	public void deployVerticle() {
		Vertx.vertx().deployVerticle(staticServer);
	}
}
