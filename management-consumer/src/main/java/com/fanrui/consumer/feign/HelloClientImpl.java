package com.fanrui.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloClientImpl implements HelloClient{
    @Override
    public String helloService(String name) {
        return "sorry,net error";
    }
}
