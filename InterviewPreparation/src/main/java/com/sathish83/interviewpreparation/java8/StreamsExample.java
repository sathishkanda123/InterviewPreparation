package com.sathish83.interviewpreparation.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sathish83.interviewpreparation.model.JobSeeker;

public class StreamsExample {

	private void sort(List<Integer> numbers) throws InterruptedException {
		System.out.println("Sorted order is");
	    numbers.stream().sorted().forEach(x->System.out.println(x));
	    System.out.println("Sorted Reverse order is");
	    numbers.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
    	wait();
	}
	
	//reduction stream operations allow us to produce one single result from a sequence of elements,
	//(0+3),(3+2),(5+1),(6+2)
	private void reduce(List<Integer> numbers) {
		System.out.println("Reduce element is");
		int result = numbers
				  .stream()
				  .reduce(0, (subtotal, element) -> 
				  subtotal + element);
		System.out.println(result);
	}

	private void distinct(List<Integer> numbers) {
		System.out.println("Streams distinct explanation");
		List<Integer> square = numbers.stream().distinct().collect(Collectors.toList());
		square.forEach(x->System.out.println(x));
	}

	private void filter(List<Integer> numbers) {
		System.out.println("Streams Filter explanation");
		List<Integer> square = numbers.stream().filter(x->x==2).collect(Collectors.toList());
		square.forEach(x->System.out.println(x));
	}

	private void map(List<Integer> numbers) {
		System.out.println("Streams Map explanation");
		List<Integer> square = numbers.stream().map(x->x*x).collect(Collectors.toList());
		square.forEach(x->System.out.println(x));
	}
	
	private void findElementandCount(List<Integer> numbers) {
		
		System.out.println("Total Count and elemnt find");
		System.out.println(numbers.stream().distinct().count());
		boolean isExist = numbers.stream().anyMatch(element -> element==3);
		System.out.println(isExist);
	}

	
	private void nullCheck(List<Integer> numbers) {
	
		System.out.println("Null check");
		List<Integer> totalNumbers = new ArrayList<Integer>();
		totalNumbers.add(20);
		totalNumbers.add(10);
		//totalNumbers.add(null);
		totalNumbers.add(30);
		totalNumbers.add(40);
		totalNumbers.add(50);
		System.out.println("Parllel stream");
		totalNumbers.parallelStream().forEach(val->System.out.println(val.toString())); 
		//parllel strem print all values and throw null poiner exception
		System.out.println("Normal Stream");
		totalNumbers.stream().forEach(System.out::println);
		
	}


	public static void main(String[] args) {
		
		//create a stream
		Stream<String> streamempty = Stream.empty();
		System.out.println("Stream empty is"+streamempty.count());
		StreamsExample sr= new StreamsExample();
		List<Integer> numbers = Arrays.asList(3,2,1,2);
		sr.map(numbers);
		sr.filter(numbers);
		sr.distinct(numbers);
		sr.reduce(numbers);
		sr.nullCheck(numbers);
		sr.findElementandCount(numbers);
		sr.callFunction();
	}

	private void callFunction() {
		System.out.println("Call function test");
		List<String> js = new ArrayList<String>();
	    js.add("Yaswanth");
	    js.add("Ethiraj");
		js.add("Gowtham");
		List<JobSeeker> jobSeekersList = new ArrayList<>(js.size()); // if you are not size specified use stream , dont use parallel stream
		
		js.parallelStream().forEach(seeker->{
		 jobSeekersList.add(convertStringToJobSeeker(seeker));		
		});
		System.out.println("Show JobSeekers");
		jobSeekersList.forEach(val->System.out.println(val.getName()));
	}
	
	 JobSeeker convertStringToJobSeeker(String name){
		 System.out.println("Convert called");
		 JobSeeker js = new JobSeeker();
		 js.setName(name);
		 js.setExperience(3);
		 return js;
	}

}
