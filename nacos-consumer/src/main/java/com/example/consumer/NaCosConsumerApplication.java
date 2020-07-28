package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author REN
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.example.consumer.feign"})
public class NaCosConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(NaCosConsumerApplication.class, args);
    }

}
