package com.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.notification.config.CosmosProperties;

@SpringBootApplication
public class CarNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarNotificationApplication.class, args);
	}

}
