package com.java.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationMain {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("batman");
		studentList.add("superman");
		studentList.add("wonderman");
		studentList.add("flash");
//		typical for loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}

		System.out.println("--------------------------------");
//		for each loop
		for (String str : studentList) {
			System.out.println(str);
		}
		
		
		System.out.println("--------------------------------");
//		JDK 8- streams and lambda
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("--------------------------------");
//		By iterator
		Iterator<String> itr= studentList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
