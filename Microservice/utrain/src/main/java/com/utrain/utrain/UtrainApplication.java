package com.utrain.utrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//@EnableSwagger2
//@EnableCircuitBreaker

@SpringBootApplication
@EnableDiscoveryClient


public class UtrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtrainApplication.class, args);
    }
}
