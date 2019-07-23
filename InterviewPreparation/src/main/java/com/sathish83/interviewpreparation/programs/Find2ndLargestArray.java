package com.sathish83.interviewpreparation.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find2ndLargestArray {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,4,6,8,9);
		Collections.sort(values);
		System.out.println("Largest value is"+values.get(values.size()-2));
	}
	
}
