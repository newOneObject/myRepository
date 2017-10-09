package com.bldz.test;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public  class ServiceHiApplication{

	private  static   final Logger LOG = Logger.getLogger(ServiceHiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return  new RestTemplate();
	}

	@RequestMapping(value = "/hi")
	public  String callHome(){
		LOG.info("callHome  testing ");
		return  restTemplate.getForObject("http://localhost:9013/miya",String.class);
	}


	@RequestMapping(value = "/info")
	public  String  info(){
		LOG.info("info  testing ... ");
		return "i'm service-hi";
	}

	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}

}
