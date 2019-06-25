package com.sathish83.interviewpreparation.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sathish83.interviewpreparation.model.Process;

public class RoundRobinFashion {

	private static  List<Process> processStatus;
	
	public List<Process> getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(List<Process> processStatus) {
		this.processStatus = processStatus;
	}
	
	static void startNewThread(Process rb){
		addIntoList(rb);
	}
	/*
	 * Default it will do by processor in terms of thread
	 */
	static void addIntoList(Process ps) {
		System.out.println("BurstTime for"+ps.getProcessName()+"is"+ps.getBurstTime());
		processStatus.add(ps);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please enter no of Threads you need..");
		RoundRobinFashion rb = new RoundRobinFashion();
		Scanner input = new Scanner(System.in);
		int noOfThreads=input.nextInt();
		processStatus = new ArrayList<>(noOfThreads);
		for(int i = noOfThreads;i>0;i--) {
			Process p = new Process();
			p.setProcessName("Sathish"+i);
			p.setBurstTime(2*i);
			RoundRobinFashion.startNewThread(p);
		}
		rb.startAllThreadExecution(noOfThreads);
	}

	private void startAllThreadExecution(int totalNoOfThreads) {
		
		int[] totalComplted = {0};
		 
		while(true) {
			processStatus.forEach(ps->{
				if(ps.getBurstTime()>0) {
					ps.setBurstTime((ps.getBurstTime())-totalNoOfThreads);
					System.out.println("Process Is "+ps.getProcessName()+" "+"  "+"Remaining Time is ##" +ps.getBurstTime());
				}else if(ps.getCompletionTime()==0) {
					return;
				}else if(ps.getBurstTime()<=0) {
					ps.setCompletionTime(0);
					totalComplted[0]++;
				}
			});
			if(totalComplted[0]==totalNoOfThreads) {
				System.out.println("Thread round Robin Fashion Completed");
				break;
			}
		}
	}
}
