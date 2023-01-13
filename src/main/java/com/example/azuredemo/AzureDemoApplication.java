package com.example.azuredemo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld(@RequestParam(defaultValue = "Cloud") String name) {
		return "Hello " + name;
	}

	@GetMapping("/user-agent")
	public String userAgent(HttpServletRequest request) {
		return request.getHeader("User-Agent");
	}
}
