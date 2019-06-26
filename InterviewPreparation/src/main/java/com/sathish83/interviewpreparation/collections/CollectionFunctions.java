package com.sathish83.interviewpreparation.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionFunctions {

	
	public static void main(String[] args) {
		
		arrayList();
		linkedList();
		stack();
		CopyOnWriteArrayList();
		dequeue();
		arrayDequeue();
		blockingQueue();
		hashSet();
		treeSet();
		hashMap();
		linkedHashMap();
		treeMap();
		synchronizedCollection();
		concurrentCollection();
		failFast();
		failSafe();
		comparator();
		comparable();
		sorting();
		reverseOrder();
		collectionClass();
	}

	private static void collectionClass() {
		// TODO Auto-generated method stub
		
	}

	private static void reverseOrder() {
		// TODO Auto-generated method stub
		
	}

	private static void sorting() {
		// TODO Auto-generated method stub
		
	}

	private static void comparable() {
		// TODO Auto-generated method stub
		
	}

	private static void comparator() {
		// TODO Auto-generated method stub
		
	}

	private static void failSafe() {
		// TODO Auto-generated method stub
		
	}

	private static void failFast() {
		// TODO Auto-generated method stub
		
	}

	private static void blockingQueue() {
		// TODO Auto-generated method stub
		
	}

	private static void CopyOnWriteArrayList() {
		// TODO Auto-generated method stub
		
	}

	private static void concurrentCollection() {
		// TODO Auto-generated method stub
		
	}

	private static void synchronizedCollection() {
		// TODO Auto-generated method stub
		
	}

	private static void treeMap() {
		// TODO Auto-generated method stub
		
	}

	private static void linkedHashMap() {
		// TODO Auto-generated method stub
		
	}

	private static void hashMap() {
		// TODO Auto-generated method stub
		
	}

	private static void treeSet() {
		// TODO Auto-generated method stub
		
	}

	private static void hashSet() {
		// TODO Auto-generated method stub
		
	}

	private static void arrayDequeue() {
		// TODO Auto-generated method stub
		
	}

	private static void dequeue() {
		// TODO Auto-generated method stub
		
	}

	private static void stack() {
		// TODO Auto-generated method stub
		
	}

	private static void linkedList() {
	
	   LinkedList<String> linkedList = new LinkedList<>();
	   linkedList.add("Sindhu");
	   linkedList.add("Sree");
	   linkedList.add("Surya");
	   System.out.println("Linkedlist Listing the values...");
	   linkedList.forEach(System.out::println);
	   System.out.println();
	}

	private static void arrayList() {
		List<String> arrayList= new ArrayList<>();
		arrayList.add("Sathish");
		arrayList.add("Shadhap");
		arrayList.add("Tom");
		System.out.println("ArrayList Listing the values...");
		arrayList.forEach(System.out::println);
		System.out.println();
	}

}
