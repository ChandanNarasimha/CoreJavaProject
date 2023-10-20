package com.exp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppwithdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppwithdbApplication.class, args);
		System.out.println("Database");
	}

}
