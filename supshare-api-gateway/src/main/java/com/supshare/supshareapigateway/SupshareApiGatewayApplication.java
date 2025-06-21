package com.supshare.supshareapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SupshareApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupshareApiGatewayApplication.class, args);
	}

}
