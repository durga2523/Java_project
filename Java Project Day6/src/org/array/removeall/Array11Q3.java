package org.array.removeall;

import java.util.ArrayList;
import java.util.List;

public class Array11Q3 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(10);//input 1
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		List<Integer>li2=new ArrayList<Integer>();
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		li2.add(600);
		li2.add(700);
		li2.add(8000);
		System.out.println(li);
		System.out.println(li2);
		 li.removeAll(li2);
		System.out.println(" removeAll() function : "+li);
	}
}
