package com.service.microapp.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {

	public static void main(String[] args) {

		System.setProperty("spring.config.name","registration_server");
		SpringApplication.run(RegistrationServer.class, args);
	}

}
