package org.array.getvalue;

import java.util.ArrayList;
import java.util.List;

public class Array6Q3{
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		Integer integer = li.get(8);
		System.out.println(li);
		System.out.println(" the value present at 8th index : " + integer);
	}
}
	