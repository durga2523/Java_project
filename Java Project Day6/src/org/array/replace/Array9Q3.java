package org.array.replace;


import java.util.ArrayList;
import java.util.List;

public class Array9Q3 {
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
		li.add(30);
		for (int i = 0; i <li.size(); i++) {
			if(li.get(i)==10) {
				li.set(i, 100);
			}
		}
		System.out.println(li);
		System.out.println("  Replace the 10 into 100 in List : " + li);
	}
}
