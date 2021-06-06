package com.completablefuture.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.completablefuture.poc.service.CompletableFutureService;

@SpringBootApplication
public class PocApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);		
		
	}

}
