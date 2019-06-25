package com.sathish83.interviewpreparation.threads;

public class EThread extends Thread{

	@Override
	public void run() {
		System.out.println("Thread is Running...");
	}
	
	public static void main(String[] args) {
		
		EThread et = new EThread();
		et.start();
		
	}
	
}
