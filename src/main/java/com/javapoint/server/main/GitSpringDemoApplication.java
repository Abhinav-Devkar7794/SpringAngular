package com.javapoint.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitSpringDemoApplication.class, args);
	}
	
	public void hello() {
		
		System.out.println("Hello");
	}

}
