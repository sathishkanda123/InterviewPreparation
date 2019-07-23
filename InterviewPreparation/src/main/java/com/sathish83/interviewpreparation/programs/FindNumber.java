package com.sathish83.interviewpreparation.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Find the closest value of given number
 */
public class FindNumber {
	
	
	static void findClosestValue(int target) {
		
		List<Integer> araylists = Arrays.asList(3,4,1,5,6,8,9,11,100,50);
		int index=Collections.binarySearch(araylists, target);
		if(index>0) {
			System.out.println("Value found at"+index);
		}else {
			System.out.println("Value Not found");
		}
	}
	
	public static void main(String[] args) {
		 System.out.println("Find the closet value of given array");
		 findClosestValue(8); 
		 
	}
	
	
	
	
	

}
