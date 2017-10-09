package com.bldz.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pactera on 2017/9/29.
 */
@RestController
public class HiController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "hi")
    public String hi() {
        return foo;
    }
}
