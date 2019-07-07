package com.sathish83.interviewpreparation.java;

import com.sathish83.interviewpreparation.model.JobSeeker;

public class DeepCopy {

	
	public static void main(String[] args) {
		
		JobSeeker js = new JobSeeker();
		JobSeeker js1 = new JobSeeker(js); // Deep copy
		
	}

}
