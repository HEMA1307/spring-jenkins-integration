package com.example.spring_jenkins_integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test started....");
		assertEquals(true, true);
	}

}
