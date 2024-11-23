package com.example.spring_jenkins_integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {
	
	Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);
	
	public void message() {
		System.out.println("Application started...............");
		logger.info("Application started...............");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
