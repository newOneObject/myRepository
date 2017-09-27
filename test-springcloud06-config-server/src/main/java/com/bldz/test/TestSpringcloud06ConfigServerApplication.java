package com.bldz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TestSpringcloud06ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringcloud06ConfigServerApplication.class, args);
	}
}
