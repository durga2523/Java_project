package org.array.remove;

import java.util.ArrayList;
import java.util.List;

public class Array7Q2 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		int indexOf = li.get(10);
		Integer remove = li.remove(indexOf);
		System.out.println(li);
		System.out.println("  Remove the value present at 10th index : " + remove);
	}
}