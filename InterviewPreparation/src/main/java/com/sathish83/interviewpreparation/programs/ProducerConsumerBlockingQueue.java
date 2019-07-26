package com.sathish83.interviewpreparation.programs;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

	BlockingQueue<String> queues= new ArrayBlockingQueue<>(10);
    volatile int i=1;	
	
	void queueWorkStarts(){
		while(true) {
			i++;
			if(i<=5) {
				producerStarts();
				consumerStarts();
			}else {
				break;
			}
		}
	}
	
	
	
	void producerStarts() {
		
		final Runnable producer = () ->{
			
			try {
				queues.put("Sathish"+i);
				System.out.println("Thread Name at Producer"+Thread.currentThread()+"Inserted Value is "+""+
				queues.peek());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
		new Thread(producer).start();
		new Thread(producer).start();
	}
	
	void consumerStarts() {

		final Runnable consumer = () ->{

			try {
			System.out.println("Thread Name at Consumer"+Thread.currentThread()+"Value is"+""+queues.take());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		};
		new Thread(consumer).start();
		new Thread(consumer).start();
	}
	
	
	
	public static void main(String[] args) {
		
		ProducerConsumerBlockingQueue pcbq = new ProducerConsumerBlockingQueue();
		pcbq.queueWorkStarts();
		
	}
	
	}