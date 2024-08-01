package org.array.replace;


import java.util.ArrayList;
import java.util.List;

public class Array9Q1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		int indexOf = li.indexOf(300);
		Integer set = li.set(indexOf, 350);
		System.out.println(li);
		System.out.println(" Replace the value 300 into 350 in the list : " + set);
	}
}
