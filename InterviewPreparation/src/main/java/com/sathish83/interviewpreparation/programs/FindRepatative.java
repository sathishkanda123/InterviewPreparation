package com.sathish83.interviewpreparation.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 *   if user enters google , facebook and facebook in string we have to show facebook has output
 * 
 */
public class FindRepatative {
	
	
	private static void process(String[] arr) {
		
			Map<String, Integer> mapNames = new HashMap<>();
			for(String name:arr) {
				if(mapNames.containsKey(name)) 
					mapNames.put(name, mapNames.get(name)+1);
				else
					mapNames.put(name,1);
			}
		
			// no need of sort to you can compare value which is greater than 1 ..you can print those directly
			Map<String, Integer> finalhashmap =	  mapNames.entrySet().
			  stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, 
					    Map.Entry::getValue,
					    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
			
			finalhashmap.entrySet().stream().forEach(System.out::println);
   	}

	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("No of Values you have to enter");
			int n = sc.nextInt();
			String arr[] = new String[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter Value");
				arr[i]=sc.next();
			}
			process(arr);
		}
		
	}

}
