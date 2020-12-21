package com.weblearner.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootTaskandscheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTaskandscheduleApplication.class, args);
	}

}
