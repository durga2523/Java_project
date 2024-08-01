package org.array.remove;

import java.util.ArrayList;
import java.util.List;

public class Array7Q1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		Integer remove = li.remove(2);
		System.out.println(li);
		System.out.println("  Remove the value present at 2nd index : " + remove);
	}
}
