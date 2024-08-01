package org.array.getvalue;

import java.util.ArrayList;
import java.util.List;

public class Array6Q2 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		Integer integer = li.get(4);
		System.out.println(li);
		System.out.println(" the value present at 4th index : " + integer);
	}
}

