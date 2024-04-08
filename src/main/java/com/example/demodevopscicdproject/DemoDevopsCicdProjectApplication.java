package com.example.demodevopscicdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDevopsCicdProjectApplication {

	@GetMapping("test")
	public String testService() {
		return "YOUPIIII I'm running.....";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoDevopsCicdProjectApplication.class, args);
	}

}
