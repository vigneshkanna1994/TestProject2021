package com.java.collection.arraylist.practice;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(123);
		ar.add("234234");
		ar.add("234243sfsdfgsdfg");
		ar.add("asdfasdfsdf");
		ar.add(true);
		System.out.println(ar);
		System.out.println(ar.get(3));
		System.out.println(ar.size());
	}

}
