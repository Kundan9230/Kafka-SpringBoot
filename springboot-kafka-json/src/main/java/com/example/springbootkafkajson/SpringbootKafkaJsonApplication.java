package com.example.springbootkafkajson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class SpringbootKafkaJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaJsonApplication.class, args);
	}

}
