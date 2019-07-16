package com.sathish83.interviewpreparation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;

import com.sathish83.interviewpreparation.model.JobSeeker;


@Service
public class InterviewService {

	Logger log = Logger.getLogger(InterviewService.class.getSimpleName());
	
//	@PersistenceContext
//	private EntityManager entityManager;


	public void saveUser(JobSeeker js) {
		
//		Query qu = this.entityManager.createQuery("select *From products");
//		List<String> resultList = qu.getResultList();
//		resultList.stream().filter(s->s.equalsIgnoreCase("Sathish")).collect(Collectors.toList());
//	
//	  // criteraquery
//		
//		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
//		CriteriaQuery<JobSeeker> cq = cb.createQuery(JobSeeker.class);
//		Root<JobSeeker> root = cq.from(JobSeeker.class);
//		cq.select(root);
//		
//		org.hibernate.query.Query<JobSeeker> fnalquery=(org.hibernate.query.Query<JobSeeker>) this.entityManager.createQuery(cq);
//        List<JobSeeker> jobist = fnalquery.getResultList();
//        
        
	}
	
	public List<JobSeeker> getJobSeekers(){
		
		log.info("get JobSeekers called");
		List<JobSeeker> jobseekerList = new ArrayList<>();
		JobSeeker js = new JobSeeker();
		js.setName("Sathish");
		js.setExperience(5);
		jobseekerList.add(js);
		return jobseekerList;
		
	}
	
	
	
	
}
