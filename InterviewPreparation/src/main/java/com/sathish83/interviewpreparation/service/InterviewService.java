package com.sathish83.interviewpreparation.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.sathish83.interviewpreparation.model.JobSeeker;


@Service
public class InterviewService {

	@PersistenceContext
	private EntityManager entityManager;


	public void saveUser(JobSeeker js) {
		
		
	}
	
	
	
}
