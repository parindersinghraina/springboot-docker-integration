package com.integration.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	/*
	The class is flagged as a @SpringBootApplication and as a @RestController,
	 meaning that it is ready for use by Spring MVC to handle web requests.
	 @RequestMapping maps / to the home() method, which sends a Hello World response.
	 The main() method uses Spring Boot’s SpringApplication.run() method to launch an application.
	 */

	@RequestMapping("/api/v1/hello-world")
	public String helloDockerWorld() {
		return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
