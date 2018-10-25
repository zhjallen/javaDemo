package com.zhj.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDemo {
    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }
}
