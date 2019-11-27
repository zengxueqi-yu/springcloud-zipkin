package com.july.servicein.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 测试接口类
 * @author zqk
 * @since 2019/11/22
 */
@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/test")
    public String test1(){
        return "this is service-in";
    }

    @RequestMapping("/test1")
    public String test(){
        return restTemplate.getForObject("http://localhost:8603/test",String.class);
    }

}
