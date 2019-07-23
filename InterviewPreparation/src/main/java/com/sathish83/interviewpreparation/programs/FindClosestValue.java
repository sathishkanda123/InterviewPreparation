package com.sathish83.interviewpreparation.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FindClosestValue {

	static List<Integer> values= Arrays.asList(1,10,20,4,7,9,10);
	
    static void findClosetValue(int target, int start, int end, int mid) {
      System.out.println("mid value is"+mid);
      while(true) {
          if(values.get(mid)>target) {
            end=mid-1;
          }else if(values.get(mid)<target) {
        	  start = mid+1;
          }else {
        	  System.out.println("Value found an dnearest value is"+values.get(mid));
        	  break;
          }
          
      }
      
	}
	
	public static void main(String[] args) {
	  System.out.println("Enter the value you have to find");
	  int start=0;
	  int end = values.size()-1;
	  int mid=(start+end)/2;
	  Collections.sort(values);
	  try(Scanner sc= new Scanner(System.in)){
		  findClosetValue(sc.nextInt(),start,end,mid);
	  }
   }
}
