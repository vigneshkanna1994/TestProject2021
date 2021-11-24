package com.java.collection.arraylist.practice;

import java.util.ArrayList;

public class Demo2_VirtualCapacity {

	public static void main(String[] args) {
		// default virtual cc is 10
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println("physical cc " + ar.size());
		ar.add("fdgdgfdf");
		System.out.println("physical cc " + ar.size());
		// increased virtual cc to 20
		ArrayList<Object> ar1 = new ArrayList<Object>(20);
		ar1.add(1233);
	}

}
