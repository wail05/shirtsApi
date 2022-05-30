package com.example.apishirt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class 	ApiShirtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiShirtApplication.class, args);
		System.out.println("hello world");
	}

}
