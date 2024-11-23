package com.example.spring_jenkins_integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Test started.....");
		assertEquals(true, true);
	}

}
