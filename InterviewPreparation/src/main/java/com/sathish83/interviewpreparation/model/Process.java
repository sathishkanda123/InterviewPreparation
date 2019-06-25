package com.sathish83.interviewpreparation.model;

public class Process {
	
	
	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	public int getWaitingTime() {
		return waitingTime;
	}

	public void setWaitingTime(int waitingTime) {
		this.waitingTime = waitingTime;
	}

	public int getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(int completionTime) {
		this.completionTime = completionTime;
	}

	private int burstTime;
	
	private int waitingTime;
	
	private int completionTime = 100;

	private String processName;

}
