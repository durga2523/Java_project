package org.set4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(90);
		li.add(10);
		li.add(10);
		List<Integer>li1=new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(60);
		li1.add(50);
		li1.add(40);
		li1.add(70);
		li1.add(80);
		li1.add(90);
		Set<Integer>s=new LinkedHashSet<>(li);
		System.out.println(s);
		Set<Integer>s1=new LinkedHashSet<>(li1);
		System.out.println(s1);
		 s.retainAll(s1);
		System.out.println("Common values: " + s);
		
		
	}
}
