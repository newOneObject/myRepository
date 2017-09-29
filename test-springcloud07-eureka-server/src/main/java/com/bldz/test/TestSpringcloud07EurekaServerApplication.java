package com.bldz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TestSpringcloud07EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringcloud07EurekaServerApplication.class, args);
	}
}
