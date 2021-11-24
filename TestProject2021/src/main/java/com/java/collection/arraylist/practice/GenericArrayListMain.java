package com.java.collection.arraylist.practice;

import java.util.ArrayList;

public class GenericArrayListMain {

	public static void main(String[] args) {
		ArrayList<Integer> markslist = new ArrayList<Integer>();
		markslist.add(100);
		ArrayList<Double> markslistDouble = new ArrayList<Double>();
		markslistDouble.add(12.343);
		ArrayList<String> markslistString = new ArrayList<String>();
		markslistString.add("Hundred");
		System.out.println(markslist);
		System.out.println(markslistDouble);
		System.out.println(markslistString);
	}

}
