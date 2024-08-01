package org.array.addvalues;

import java.util.ArrayList;
import java.util.List;

public class Array8Q4 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		 int lastIndex = -1;
	        for (int i = li.size() - 1; i >= 0; i--) {
	            if (li.get(i) == 10) {
	                lastIndex = i;
	                break;
	            }
	        }

	        // Insert 100 after the last occurrence of 10
	        if (lastIndex != -1) {
	            li.add(lastIndex+1, 100);
	        }

	        // Output
	        System.out.println("Updated list: " + li);
	    }
		
	}
