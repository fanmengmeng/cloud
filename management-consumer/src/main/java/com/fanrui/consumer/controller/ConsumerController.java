package com.fanrui.consumer.controller;

import com.fanrui.consumer.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private HelloClient helloClient;

    @GetMapping("/feign")
    public String feign(@RequestParam String name) {
        return name + "-----" + helloClient.helloService(name);
    }
}
