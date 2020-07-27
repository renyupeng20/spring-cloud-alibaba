package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 86151
 */
@FeignClient("nacos-provider")
public interface ConsumerFeign {

    @GetMapping("/echo")
    String getEcho(@RequestParam("name") String name);
}
