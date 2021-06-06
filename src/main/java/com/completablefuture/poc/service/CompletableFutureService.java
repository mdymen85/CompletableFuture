package com.completablefuture.poc.service;

import org.springframework.stereotype.Service;

@Service
public class CompletableFutureService {

	/**
	 * Execute a for with a sleep of 1 seconds printing a message
	 * 
	 * @param method
	 * @return
	 */
	public void method(int method) {
		
		for (int i = 0; i < 10; i = i +1) {
			System.out.println("Method " + method + " number " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
