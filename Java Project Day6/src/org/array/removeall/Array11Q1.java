package org.array.removeall;

import java.util.ArrayList;
import java.util.List;

public class Array11Q1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(10);//input 1
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		List<Integer>li2=new ArrayList<Integer>();
		li2.add(30);
		li2.add(40);
		li2.add(50);
		li2.add(60);
		li2.add(80);
		System.out.println(li);
		System.out.println(li2);
		 li.removeAll(li2);
		System.out.println(" removeAll() function : "+li);
	}
}
