package com.example.consumer.controller;

import com.example.consumer.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 86151
 */
@RestController
public class ConsumerController {

    private final ConsumerFeign consumerFeign;

    public ConsumerController(ConsumerFeign consumerFeign) {
        this.consumerFeign = consumerFeign;
    }

    @GetMapping(value = "/my/echo")
    public String echo(@RequestParam("name") String name) {
        return consumerFeign.getEcho(name);
    }
}

