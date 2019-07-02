package com.bmzc.Eurekaserverbmzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerBmzcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerBmzcApplication.class, args);
	}

}
