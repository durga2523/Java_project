package org.array.replace;


import java.util.ArrayList;
import java.util.List;

public class Array9Q2 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(10);
		Integer set = li.set(7, 90);
		System.out.println(li);
		System.out.println("  Replace the value present in 7th index as 90 : " + set);
	}
}
