package com.alahli.middleware.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class MiddlewareAccountApIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiddlewareAccountApIsApplication.class, args);
	}

}
