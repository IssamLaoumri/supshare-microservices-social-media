package com.supshare.supshareconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SupshareConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupshareConfigServiceApplication.class, args);
    }

}
