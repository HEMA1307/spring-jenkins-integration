package com.example.spring_jenkins_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {
	
	public void message() {
		System.out.println("Application started...............");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
