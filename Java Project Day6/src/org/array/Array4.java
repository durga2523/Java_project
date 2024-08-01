package org.array;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Array4 {
public static void main(String[] args) {
	List<Integer> li1=new ArrayList<Integer>();//	new arraylist
	li1.add(10);
	li1.add(20);
	li1.add(30);
	li1.add(90);
	li1.add(10);
	li1.add(10);
	li1.add(40);
	li1.add(50);
	System.out.println(li1);
	int size = li1.size();
	System.out.println("length of array : "+size);
	List <Integer>li2=new LinkedList<Integer>();//new linkedlist
	li2.add(100);
	li2.add(200);
	li2.add(300);
	li2.add(400);
	li2.add(500);
	li2.add(600);
	li2.add(700);
	System.out.println(li2);
	int size1 = li2.size();
	System.out.println("length of linkedlist : "+size1);
	List <Integer>li3=new Vector<Integer>();// new vector()
	li3.add(105);
	li3.add(205);
	li3.add(305);
	li3.add(405);
	li3.add(505);
	li3.add(605);
	li3.add(705);
	li3.add(805);
	System.out.println(li3);
	int size2 = li3.size();
	System.out.println("length of vector : "+size2);
	
}
}
