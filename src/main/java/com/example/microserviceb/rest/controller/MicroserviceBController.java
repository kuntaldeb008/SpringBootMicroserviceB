package com.example.microserviceb.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microserviceasdk.sdk.MicroserviceAService;

@RestController
public class MicroserviceBController {
  
	/*
	 * autowiring it to fix "this.microserviceAService" is null
	 */
	@Autowired
	private MicroserviceAService microserviceAService; 

    @GetMapping("/detailsfrommicroserviceaapi")
    public List<String> getDetailsFromMicroserviceAApi() {
        return microserviceAService.getDataFromMicroServiceAApi();
    }
    
    @GetMapping("/detailsfrommicroservicea")
    public List<String> getDetailsFromMicroserviceA() {
        return microserviceAService.returnDataFromServiceA();
    }

}
