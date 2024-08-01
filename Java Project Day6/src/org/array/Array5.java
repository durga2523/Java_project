package org.array;

import java.util.ArrayList;
import java.util.List;

public class Array5 {
public static void main(String[] args) {   //Get indexvalues()
	List<Integer> li1=new ArrayList<Integer>();
	li1.add(10);
	li1.add(20);
	li1.add(30);
	li1.add(90);
	int indexOf = li1.indexOf(10);
	System.out.println(li1);
	System.out.println("Index value of 10 : "+indexOf);
	//lastindexof
	List<Integer>li2=new ArrayList<Integer>();
	li2.add(10);
	li2.add(20);
	li2.add(30);
	li2.add(90);
	li2.add(10);
	li2.add(10);
	li2.add(40);
	li2.add(50);
	int lastIndexOf = li2.lastIndexOf(10);
	System.out.println(li2);
	System.out.println("last index value of 10 : "+lastIndexOf);
	int indexOf2 = li2.indexOf(50);
	System.out.println(li2);
	System.out.println(" the index value of 50 : "+indexOf2);
	int indexOf3 = li2.indexOf(90);
	System.out.println(li2);
	System.out.println(" the index value of 90 : "+indexOf3);
	List<Integer> li3 = new ArrayList<>();//each index value of 10 present 
    li3.add(10);
    li3.add(20);
    li3.add(30);
    li3.add(90);
    li3.add(10);
    li3.add(10);
    li3.add(40);
    li3.add(50);
    li3.add(10);
 // Find and print the index values of 10
    for (int i = 0; i < li3.size(); i++) {
        if (li3.get(i) == 10) {
            System.out.println("Index of 10: " + i);
        }
    }
    {
    for (int i = 0; i < li3.size();i++) {
        if (li3.get(i) == 70) {
            System.out.println("Index of 70: " + i);
        }else {
			System.out.println("Index of 70 is not in list ");
		}
    }
} 
}
}
