package com.salcedoFawcett.services.parameterData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ParameterDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParameterDataApplication.class, args);
	}

}
