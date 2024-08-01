package org.set4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		List<Integer>li1=new ArrayList<Integer>();
		li1.add(100);
		li1.add(200);
		li1.add(300);
		li1.add(400);
		li1.add(500);
		li1.add(600);
		li1.add(700);
		li1.add(8000);
		Set<Integer>s=new TreeSet<>(li);
		System.out.println(s);
		Set<Integer>s1=new TreeSet<>(li1);
		System.out.println(s1);
		 s.retainAll(s1);
		System.out.println("Common values: " + s);
		
		
	}
}
