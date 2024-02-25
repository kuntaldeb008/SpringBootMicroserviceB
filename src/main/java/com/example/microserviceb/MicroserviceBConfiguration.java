package com.example.microserviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.microserviceasdk.sdk.MicroserviceAService;

@Configuration
public class MicroserviceBConfiguration {

	@Autowired
    private RestTemplate restTemplate; 

	/*
	 * to fix microserviceAService in com.example.microserviceb.rest.controller.MicroserviceBController required a bean of type 'com.example.microserviceasdk.sdk.MicroserviceAService' that could not be found.
	 * The injection point has the following annotations:
	 * @org.springframework.beans.factory.annotation.Autowired(required=true)
	 * Action:
	 * Consider defining a bean of type 'com.example.microserviceasdk.sdk.MicroserviceAService' in your configuration.
	 */
    @Bean
    public MicroserviceAService microserviceAService() {
        return new MicroserviceAService(restTemplate); 
    }
}
