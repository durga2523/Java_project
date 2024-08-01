package org.array.addvalues;

import java.util.ArrayList;
import java.util.List;

public class Array8Q3 {
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
		li.add(8,80);
		System.out.println("Add a value 80 at the 8th index of list : " +li );
	}
}