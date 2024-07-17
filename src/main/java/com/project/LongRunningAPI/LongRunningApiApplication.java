package com.project.LongRunningAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class LongRunningApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LongRunningApiApplication.class, args);
	}

}
