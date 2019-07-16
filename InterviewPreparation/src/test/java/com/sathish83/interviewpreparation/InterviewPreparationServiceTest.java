package com.sathish83.interviewpreparation;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.sathish83.interviewpreparation.model.JobSeeker;
import com.sathish83.interviewpreparation.service.InterviewService;

@RunWith(MockitoJUnitRunner.class)
public class InterviewPreparationServiceTest {

	@Spy
	InterviewService is;
	
	@Test
	public void getTestServiceTest() {
		InterviewService is = mock(InterviewService.class);
		List<JobSeeker> jobseekerList = new ArrayList<>();
		JobSeeker js = new JobSeeker();
		js.setName("Yatheesh");
		js.setExperience(5);
		jobseekerList.add(js);
		when(is.getJobSeekers()).thenReturn(jobseekerList);
		assertEquals("Yatheesh", is.getJobSeekers().get(0).getName());
	}
	
	@Test
	public void getOriginalTestServiceTest() {
		List<JobSeeker> jobseekerList = new ArrayList<>();
		JobSeeker js = new JobSeeker();
		js.setName("Sathish");
		js.setExperience(5);
		jobseekerList.add(js);
		when(is.getJobSeekers()).thenReturn(jobseekerList);
		assertEquals("Sathish", is.getJobSeekers().get(0).getName());
	}
	
	
	
	
}
