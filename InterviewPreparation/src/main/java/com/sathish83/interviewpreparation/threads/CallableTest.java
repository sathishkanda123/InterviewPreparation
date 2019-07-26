package com.sathish83.interviewpreparation.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sathish83.interviewpreparation.model.JobSeeker;

public class CallableTest implements Callable<JobSeeker>{

	JobSeeker js = new JobSeeker();
	@Override
	public JobSeeker call() throws Exception {
		System.out.println(js.hashCode());
		return js;
	}

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.submit(new CallableTest());	
	}
	
}
