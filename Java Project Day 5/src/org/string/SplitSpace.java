package org.string;

public class SplitSpace {
public static void main(String[] args) {
	System.out.println("Split1");
	System.out.println("-------");
	String w="Welcome to java class";
	String[] split = w.split(" ");
	for(int i=0;i<split.length;i++) {
	System.out.println(split[i]);
	System.out.println("");
}
	System.out.println("Split2");
	System.out.println("-------");
	String w1="Welcome to java class";
	String[] split2 = w1.split("l",-1);
	for(int i=0;i<split2.length;i++) {
		if (i<split2.length-1) {
			System.out.println(split2[i]+"l");
			
		}else {
			System.out.println(split2[i]);
	}
	
}
}
}

