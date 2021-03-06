package com.xp.cloudalibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    /*@Value("${service-url.cloudalibab-nacos-provider-service}")
    private String serverURL;*/

    @GetMapping("/consumer/payment/nacos/{id}")
    public String get(@PathVariable("id")String id){
        return restTemplate.getForObject("http://cloudalibab-nacos-provider-service" + "/payment/nacos/" + id, String.class);
    }

}
