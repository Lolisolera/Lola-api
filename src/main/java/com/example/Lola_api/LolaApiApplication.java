package com.example.Lola_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.restController"})  // Ensure it scans your controllers
public class LolaApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(LolaApiApplication.class, args);
	}
}
