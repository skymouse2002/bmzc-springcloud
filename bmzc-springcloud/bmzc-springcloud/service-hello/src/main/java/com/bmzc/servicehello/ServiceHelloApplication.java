package com.bmzc.servicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
public class ServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHelloApplication.class, args);
	}

}
