package com.java.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ListWithOtherCollection {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 30));
		System.out.println(numbers);
		ArrayList<String> names= new ArrayList<String>(Arrays.asList("klingon","arrow", "robbin"));
		System.out.println(names);

	}

}
