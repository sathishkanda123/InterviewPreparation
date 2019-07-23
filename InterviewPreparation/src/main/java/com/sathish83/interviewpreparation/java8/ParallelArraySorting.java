	package com.sathish83.interviewpreparation.java8;

public class ParallelArraySorting {

	
	
	public static void main(String[] args) {
	
		int []a = {3,2,5,6,7};
		findDuplicateinArray(a);
		
	}

	private static void findDuplicateinArray(int[] a) {
		
		int count[] = new int[a.length-1];
		int n = a[3]-1;
		System.out.println(n);
		System.out.println(count[n]);
	}
}
