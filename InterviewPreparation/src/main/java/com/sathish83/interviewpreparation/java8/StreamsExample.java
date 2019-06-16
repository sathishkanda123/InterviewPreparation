package com.sathish83.interviewpreparation.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	private void sort(List<Integer> numbers) {
		System.out.println("Sorted order is");
	    numbers.stream().sorted().forEach(x->System.out.println(x));
	    System.out.println("Sorted Reverse order is");
	    numbers.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
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

	public static void main(String[] args) {
		StreamsExample sr= new StreamsExample();
		List<Integer> numbers = Arrays.asList(3,2,1,2);
		sr.map(numbers);
		sr.filter(numbers);
		sr.distinct(numbers);
		sr.sort(numbers);
		sr.reduce(numbers);
	}
}
