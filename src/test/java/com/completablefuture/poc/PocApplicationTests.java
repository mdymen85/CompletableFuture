package com.completablefuture.poc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.completablefuture.poc.service.CompletableFutureService;

@SpringBootTest
class PocApplicationTests {

	@Autowired
	private CompletableFutureService completableFutureService;
	
	/*
	 * Execute and read the Console
	 */
	@Test
	void contextLoads() throws InterruptedException {
		
		System.out.println("Starting method 1");
		
		CompletableFuture<Void> x1  =  CompletableFuture.runAsync(() -> this.completableFutureService.method(1));		
		
		Thread.sleep(1000);
		
		System.out.println("Starting method 2");
		
		CompletableFuture<Void> x2 =  CompletableFuture.runAsync(() -> this.completableFutureService.method(2));		
		
		Thread.sleep(500);
		
		System.out.println("Starting method 3");
		
		CompletableFuture<Void> x3 =  CompletableFuture.runAsync(() -> this.completableFutureService.method(3));		
		
		System.out.println("Pass from three methods... ");
		
		Void combinedResults = CompletableFuture.allOf(x1, x2, x3).join();
		
		assertTrue(x1.isDone());
		assertTrue(x2.isDone());
		assertTrue(x3.isDone());
		
	}

}
