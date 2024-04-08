package com.example.demodevopscicdproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoDevopsCicdProjectApplicationTests {

	@Autowired
	private DemoDevopsCicdProjectApplication demoDevopsCicdProjectApplication;

	@Test
	void contextLoads() {
	}

	@Test
	public void testTestService() {
		String result = demoDevopsCicdProjectApplication.testService();
		assertEquals("YOUPIIII I'm running.....", result);
	}
}
