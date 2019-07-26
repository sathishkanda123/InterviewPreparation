package com.sathish83.interviewpreparation.java;

public class ReturnTest {
	
	int i =1;
	
  boolean test() {
	System.out.println(i);
	if(i == 10) {
		return true;
	}else {
		++i;
		test();
	}
	return false;
 }
  
  
  
  
	
	public static void main(String[] args) {
	
		
		ReturnTest rt = new ReturnTest();
		//rt.tryReturn();
		rt.testNestedFun();
	  //rt.tryWithExceptionReturn();
	}

	private void tryWithExceptionReturn() {
		try {
			int a =1/0;
		}catch(Exception e) {
			System.out.println("Exception caught"+e.getCause());
		}finally {
			System.out.println("finaly called");
		}
	}
	
	private void tryReturn() {
		System.out.println("with out exception"+1/0);
	}
	
	private void testNestedFun() {
		
		try {
			tryWithExceptionReturn();
			int a=1/0;
		}catch(Exception e) {
			System.out.println("Test Nested fun"+e.getMessage());
		}finally {
			System.out.println("Finally nested fun");
		}
	}

}
