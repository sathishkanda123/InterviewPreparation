package com.sathish83.interviewpreparation.threads;

public class EThread extends Thread{

	
	private int a =30;
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+""+"Value of a is"+a);
		a+=1;
		System.out.println(Thread.currentThread().getName()+""+"Value of a is"+a);
	}
	
	public static void main(String[] args) {
		EThread et = new EThread();
		EThread et2 = new EThread();
		et.start();
		et2.start();
	}
	
}
