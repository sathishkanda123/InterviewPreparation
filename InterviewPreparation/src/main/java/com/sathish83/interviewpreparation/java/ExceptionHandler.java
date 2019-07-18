package com.sathish83.interviewpreparation.java;

import java.io.IOException;

public class ExceptionHandler {

	void test() throws IOException  {
		
		try {
			throw new IOException("Got the message");
		}
		finally {
			System.out.println("Finally called");
		}
		
	}
	
	void test2() throws IOException {
		
		try {
			test();
			System.out.println("try in test2");
		}finally {
			System.out.println("finaly in test2");
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		ExceptionHandler eh = new ExceptionHandler();
		try {
			eh.test2();
		}catch(IOException e) {
			System.out.println("Exception is"+e.getMessage());
		}
		System.out.println("Outside code");
		
		
		
	}
}
