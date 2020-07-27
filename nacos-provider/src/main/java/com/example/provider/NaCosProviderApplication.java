package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author REN
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NaCosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaCosProviderApplication.class, args);
    }

}
