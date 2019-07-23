package com.sathish83.interviewpreparation.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.util.StopWatch;

/*
 * Java 8 for asynchronous 
 */
public class CompletebleFeature {

	/*
	 * Multiple operations which is unblock
	 * 
	 */
	void testMultipleFeature() {

		for (int i = 1; i <= 10; i++) {

			  CompletableFuture.supplyAsync(()->getOrder()).
			  thenApply(value->addValue(value)). thenApply(value->subValue(value)).
			  thenAccept(value->finalcalc(value));
			  
			  }

	}

	private Integer finalcalc(Integer value) {
		System.out.println(Thread.currentThread().getName());
		return value;
	}

	private Integer getOrder() {
		return new Integer(10);
	}

	private Integer addValue(Integer value) {
		System.out.println("While add" + value);
		return value + value;
	}

	private Integer subValue(Integer value) {
		System.out.println("While before sub" + value);
		return 10 - new Integer(20);
	}

	/*
	 * Single service which is blocking
	 * 
	 */
	void testSingleFeature() {

		ExecutorService service = Executors.newFixedThreadPool(100);
		Future<Double> future = service.submit(new Task());
		try {
			Double result = future.get(); // blocking happens here , since its wait for future results
			System.out.println("Randon value thread is" + Thread.currentThread().getName());
			System.out.println("Random value is " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		CompletebleFeature cf = new CompletebleFeature();
		cf.testSingleFeature();
		StopWatch sw = new StopWatch();
		sw.start();
		cf.testMultipleFeature();
		sw.stop();
		System.out.println(sw.getTotalTimeSeconds());

	}

	static class Task implements Callable<Double> {

		@Override
		public Double call() throws Exception {
			return Math.random();
		}

	}

	{

	}
}
