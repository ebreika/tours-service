package org.waybe.tours.toursservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ToursServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToursServiceApplication.class, args);
	}
}
