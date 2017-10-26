package com.bldz.test;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pactera on 2017/9/21.
 */
@RestController
public class ConfigController {

    public  String sayHello(@RequestParam(value = "name") String name ){
        return name + ", sayHello";
    }

}

