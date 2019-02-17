package com.kada.microservice.famouspeople;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class FamousPeopleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamousPeopleApplication.class, args);
	}

}
