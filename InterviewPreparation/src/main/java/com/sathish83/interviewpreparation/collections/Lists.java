package com.sathish83.interviewpreparation.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



import com.sathish83.interviewpreparation.model.JobSeeker;

public class Lists {

	public static void main(String[] args) {

		int[] ar = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 20;
		System.out.println("Array values:");

		int[] ary = new int[1];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 20) {
				ary[0] = ar[i];

				System.out.println("INdex of: " + i);
			}
			System.out.println("Length of array: " + ar.length);
			// System.out.println("Arr" +ar[4]);
			System.out.println("Array inDex:" + ar[ar.length - 1]);
		}
		System.out.println("Filtered array: " + ary[0]);

		System.out.println("Starting with list:" );
		
		
		
		List<String> arr = new ArrayList<>();

		arr.add("Java");
		arr.add("Apache");

		arr.add(0, "Angular");

		arr.forEach(System.out::println);
		if (arr.contains("Java")) {

		}

		List<JobSeeker> jobsSeekers = new ArrayList<JobSeeker>();
		List<JobSeeker> filterdJobSeekers = new ArrayList<JobSeeker>();

		JobSeeker js = new JobSeeker();
		js.setName("Nishanth");
		js.setExperience(2);

		JobSeeker js1 = new JobSeeker();
		js1.setName("Sathish");
		js1.setExperience(5);

		JobSeeker js2 =new JobSeeker();
		js2.setName("Nishanth");
		js2.setExperience(3);

		jobsSeekers.add(js);
		jobsSeekers.add(js1);
		jobsSeekers.add(js2);
		
		
		System.out.println("Arraylist:" +jobsSeekers.size());
		
		for(int i=0;i<jobsSeekers.size();i++) {
			if(jobsSeekers.get(i).getName().equals("Nishanth")) {
				filterdJobSeekers.add(jobsSeekers.get(i));
				
			}
		}
		for(int i=0;i<filterdJobSeekers.size();i++) {
			JobSeeker j= filterdJobSeekers.get(i);
			System.out.println("Result: "+filterdJobSeekers.get(i).getName());
			
		}
		//filterdJobSeekers = jobsSeekers.stream().filter(val -> val.getName().equals("Sathish"))
			//	.collect(Collectors.toList());

	}
}
