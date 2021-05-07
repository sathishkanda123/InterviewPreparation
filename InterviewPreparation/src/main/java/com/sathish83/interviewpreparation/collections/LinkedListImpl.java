package com.sathish83.interviewpreparation.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {

		LinkedList elements  = new LinkedList();
		elements.add(2);
		elements.add(8);
		elements.addFirst(3);
		elements.addLast(5);
		elements.push(8);
		elements.add(0,9);
		elements.removeLastOccurrence(8);

		Collections.unmodifiableList(elements);
		elements.forEach(System.out::println);

	}
}
