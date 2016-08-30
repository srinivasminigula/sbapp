package com.spring.boot.example.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		System.out.println("Hello Spring Boot Application!");
		SpringApplication.run(Application.class, args);
	}
}
