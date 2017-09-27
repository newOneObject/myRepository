package com.bldz.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pactera on 2017/9/19.
 */
@RestController
public class HiController {

    @Autowired
    private  FeignClientService feignClientService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String  sayhi(@RequestParam(value = "name" )String name){
           return  feignClientService.sayHi(name);
    }

}
