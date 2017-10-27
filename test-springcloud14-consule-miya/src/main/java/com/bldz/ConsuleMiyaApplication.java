package com.bldz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ConsuleMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsuleMiyaApplication.class, args);
	}
	
	@RequestMapping(value="/hi")
	public String hi(){
		return "hi ,I' m miya";
	}
	
}
