package org.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class LinkedHashSet1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(10);
		li.add(20);
		
		
		Set<Integer> s=new LinkedHashSet<Integer>(li);
		System.out.println("LinkedHashSet "+s);
}
}

