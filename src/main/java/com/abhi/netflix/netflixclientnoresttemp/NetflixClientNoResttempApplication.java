package com.abhi.netflix.netflixclientnoresttemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NetflixClientNoResttempApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixClientNoResttempApplication.class, args);
	}

}
