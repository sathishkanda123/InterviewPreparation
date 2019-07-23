package com.sathish83.interviewpreparation.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionFunctions {

	
	public static void main(String[] args) {
		
		arrayList();
		linkedList();
		stack();
		arrayDequeue();
		CopyOnWriteArrayList();
		blockingQueue();
		hashSet();
		treeSet();
		hashMap();
		linkedHashMap();
		treeMap();
		immutableCollection();
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
	
	private static void immutableCollection() {
		
		System.out.println("Immutable collection...");
		List<Integer> lists =new ArrayList<Integer>();
		lists.add(10);
		lists.add(20);
		lists.add(30);
		lists.forEach(System.out::println);
		lists.add(50);
		lists=Collections.unmodifiableList(lists);  // java.lang.UnsupportedOperationException
	
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


	private static void concurrentCollection() {
		
	}

	private static void synchronizedCollection() {
		// TODO Auto-generated method stub
		
	}

	private static void treeMap() {
		
		
		
	}

	private static void linkedHashMap() {
	}

	private static void hashMap() {
		
		System.out.println("Hash map duplicate check");
		
		Map<String,String> hashmapDuplicate = new HashMap<>();
		hashmapDuplicate.put("sathish","ceo");
		hashmapDuplicate.put("sathish","worker");
		hashmapDuplicate.put("sathish","TEACHER");
		System.out.println(hashmapDuplicate);
	}

	private static void treeSet() {
		
	System.out.println("Set values is");
	
	Set<String> duplicatecheck = new HashSet<String>();
	duplicatecheck.add("Sathish");
	duplicatecheck.add("Yathessh");
	duplicatecheck.add("Tiru");
	duplicatecheck.add("Sathish");
	
	duplicatecheck.forEach(v->System.out.println(v));
	
	}

	private static void hashSet() {
		
	}

	private static void blockingQueue() {
		// TODO Auto-generated method stub
		
	}

	private static void CopyOnWriteArrayList() {
		
		java.util.concurrent.CopyOnWriteArrayList<String> cp= new java.util.concurrent.CopyOnWriteArrayList<String>();
		cp.add("Chiru");
		cp.add("Rajini");
		cp.add("Mamooty");
		System.out.println("Copy on arraylist listng the values");
		cp.forEach(e->{
			System.out.println(e);
			cp.add("Amitabh");
		});
		System.out.println("Copy on arraylist After Adding in list the values");
		cp.forEach(e->{
			System.out.println(e);
		});
		System.out.println("");
	}
	
	private static void arrayDequeue() {
		
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.push("Algapan");
		ad.push("Sindhu");
		ad.push("Tom");
		ad.push("Tibin");
		ad.push("Nishanth");
		System.out.println("ArrayDequeu Listing the values...");
		ad.forEach(val->System.out.println(val));
		System.out.println("");
	}


	private static void stack() {
		
		Stack<String> stackList = new Stack<String>();
		stackList.add("Yathi");
		stackList.add("Tiru");
		stackList.add("Raghava");
		stackList.add("Krish");
		System.out.println("Stack Listing the values...");
		stackList.forEach(System.out::println);
		System.out.println();
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
		arrayList.add("Jaana");
		arrayList.set(0, "SathishKumar");
		System.out.println("ArrayList Listing the values...");
		arrayList.forEach(System.out::println);
		System.out.println();
	}
}
