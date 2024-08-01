package org.array;

public class Array1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	for (int i = 1; i <= a.length; i++) {
		sum+=i;
		
	}
	System.out.println("output : "+sum);
}
}
