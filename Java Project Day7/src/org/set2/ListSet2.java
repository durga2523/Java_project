package org.set2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListSet2 {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		li.add(505);
		li.add(605);
		Set<Integer>s=new LinkedHashSet<>();
		s.addAll(li);
		System.out.println(s);
	}
	
}
