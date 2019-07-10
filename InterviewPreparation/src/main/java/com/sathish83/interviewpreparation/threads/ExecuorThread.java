package com.sathish83.interviewpreparation.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuorThread {

	void data() {
		int a=30;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Runnable runnable =()->{
			System.out.println("Curr  ent Thread Name is "+Thread.currentThread().getName()+Thread.currentThread().getId()); 
		};
		es.execute(runnable);
	}
	
}
