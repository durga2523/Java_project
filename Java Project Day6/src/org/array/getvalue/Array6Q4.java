package org.array.getvalue;
import java.util.ArrayList;
import java.util.List;

public class Array6Q4{
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();// get()
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		System.out.println("Normal forloop");
		System.out.println(li);
		for (int i = 0; i < li.size(); i++) {
			int v=li.get(i);
			System.out.println(v);
		}
		
	}
}