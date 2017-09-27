package com.bldz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestSpringcloud03ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringcloud03ConfigApplication.class, args);
	}
}
