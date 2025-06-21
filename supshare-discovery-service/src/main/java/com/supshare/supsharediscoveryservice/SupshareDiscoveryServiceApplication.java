package com.supshare.supsharediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SupshareDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupshareDiscoveryServiceApplication.class, args);
    }

}
