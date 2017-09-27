package com.bldz.test;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignClientService{

	@Override
	public String sayHi(String name) {
		return " sorry , " + name;
	}

}
