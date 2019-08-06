package com.sathish83.interviewpreparation.collections;

import java.util.HashMap;
import java.util.Map;

import com.sathish83.interviewpreparation.model.JobSeeker;

public class HashMapObject {

	
	public static void main(String[] args) {
		
		HashMap<JobSeeker, String> hashMapoBj = new HashMap<>();
		System.out.println("Before Insertion"+hashMapoBj);
		JobSeeker js = new JobSeeker();
		JobSeeker js1 = new JobSeeker();
		js.setExperience(2);
		js.setName("Nishanth");
		hashMapoBj.put(js, "Tirchy");
		hashMapoBj.put(js, "Tirchy1");
		System.out.println("After Insertion"+hashMapoBj.size());
		hashMapoBj.forEach((k,v)->System.out.println(v));
		hashMapoBj.entrySet().stream().map(Map.Entry::getValue);
	
	}
			
}
