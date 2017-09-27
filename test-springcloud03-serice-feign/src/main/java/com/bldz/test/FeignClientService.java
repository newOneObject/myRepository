package com.bldz.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pactera on 2017/9/19.
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface FeignClientService {
    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    String sayHi(@RequestParam(value="name") String  name);
}
