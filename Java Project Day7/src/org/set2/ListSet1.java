package org.set2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListSet1 {
public static void main(String[] args) {
	List<Integer>li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	li.add(10);
	li.add(10);
	li.add(40);
	li.add(50);
	Set<Integer>s=new LinkedHashSet<>();
	s.addAll(li);
	System.out.println(s);
}
}
