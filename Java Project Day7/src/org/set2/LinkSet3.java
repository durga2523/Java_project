package org.set2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkSet3 {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		li.add(100);
		li.add(300);
		li.add(500);
		Set<Integer>s=new LinkedHashSet<>();
		s.addAll(li);
		System.out.println(s);
	}
	
}
