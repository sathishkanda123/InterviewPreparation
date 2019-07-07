package com.sathish83.interviewpreparation.threads;

public class ReentrantLock {
	
	private static java.util.concurrent.locks.ReentrantLock seatLocked = new java.util.concurrent.locks.ReentrantLock();
	
	private static void accessResource() {

		seatLocked.lock();
		System.out.println("Name"+Thread.currentThread().getName());
		seatLocked.unlock();
	
	for(int i =1;i<=5;i++) {
		System.out.println("Name"+Thread.currentThread().getName());
	}
	
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()-> accessResource()); 
		t1.start();
		Thread t2 = new Thread(()-> accessResource()); 
		t2.start();
		Thread t3 = new Thread(()-> accessResource()); 
		t3.start();
		Thread t4 = new Thread(()-> accessResource()); 
		t4.start();
	}
}
