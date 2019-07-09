package com.sathish83.interviewpreparation.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharcters {
	

	void findDuplciateCharcters(String word) {
		
		Map<Character, Integer> finalDuplicate = new HashMap<Character, Integer>();
		
		if(word==null || word.equals("")) {
			System.out.println("Please enter valid string");
		}else {
			for(char c:word.toCharArray()) {
				if(finalDuplicate.containsKey(c)) {
					finalDuplicate.put(c,finalDuplicate.get(c)+1);
				}else{
					finalDuplicate.put(c,1);
				}
			}
		}
		System.out.println("Duplicate charcters are in word"+" "+word);
		finalDuplicate.forEach((k,v)->{
			if(v>1) {
				System.out.println(k + "is" +v );
			}
		});
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		System.out.println("Enter the String you want to find the duplicates");
		try(Scanner sc = new Scanner(System.in)){
			String word = sc.nextLine();
			FindDuplicateCharcters fd = FindDuplicateCharcters.class.newInstance();
			fd.findDuplciateCharcters(word);
		}
	}

}
