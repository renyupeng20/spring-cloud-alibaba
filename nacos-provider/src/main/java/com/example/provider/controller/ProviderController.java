package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 86151
 */
@RestController
public class ProviderController {

    @GetMapping(value = "/echo")
    public String echo(@RequestParam("name") String name) {
        return "Hello Nacos Discovery " + name;
    }
}
