package com.bldz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient02Application.class, args);
	}
}
