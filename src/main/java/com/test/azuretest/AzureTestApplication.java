package com.test.azuretest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureTestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AzureTestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureTestApplication.class, args);
	}

}
