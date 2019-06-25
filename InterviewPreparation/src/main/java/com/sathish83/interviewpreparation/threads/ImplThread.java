package com.sathish83.interviewpreparation.threads;

public class ImplThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Impl thread startss..");
	}
	
	public static void main(String[] args) {
		
		ImplThread it = new ImplThread();
		Thread t1 = new Thread(it);
		t1.start();
		
	}

	
}
