package org.array.getvalue;

import java.util.ArrayList;
import java.util.List;

public class Array6Q1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		Integer integer = li.get(2);
		System.out.println(li);
		System.out.println(" the value present at 2nd index : " + integer);
	}
}
