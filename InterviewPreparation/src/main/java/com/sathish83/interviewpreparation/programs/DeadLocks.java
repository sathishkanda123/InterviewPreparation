package com.sathish83.interviewpreparation.programs;

import java.util.concurrent.locks.Lock;

public class DeadLocks {

	private Lock method1Lock = new java.util.concurrent.locks.ReentrantLock();
	private Lock method2Lock = new java.util.concurrent.locks.ReentrantLock();
	
	private void executeThreads() {
		new Thread(this::method1).start();
		new Thread(this::method2).start();
	}
	
	
	public static void main(String[] args) {

		DeadLocks dl = new  DeadLocks();
		dl.executeThreads();
		
	}

	private void method2() {
		
		try{
			method2Lock.lock();
			// do some functionlity
			method1Lock.lock();
			// do some functionality
		}finally{
			method2Lock.unlock();
			method1Lock.unlock();
		}
		
	}

	private void method1() {
		
		try{
			method1Lock.lock();
			// do some functionlity
			method2Lock.lock();
			// do some functionality
		}finally{
			method1Lock.unlock();
			method2Lock.unlock();
		}
	}
	
}
