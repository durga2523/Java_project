package org.set5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet1 {
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
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add(60);
		li1.add(80);
		Set<Integer>s=new HashSet<>(li);
		System.out.println(s);
		Set<Integer>s1=new HashSet<>(li1);
		System.out.println(s1);
		 s.removeAll(s1);
		System.out.println("Common values: " + s);
		
		
	}

}
