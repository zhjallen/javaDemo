package com.zhj.demo.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "home")
public class HomeTest {
    private String provice;
    private String city;
    private String desc;

}
