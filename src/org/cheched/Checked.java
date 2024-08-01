package org.cheched;

public class Checked {
public static void main(String[] args) throws Notvote {
	int i=17;
	if (i>=18) {
		System.out.println("eligible");
	}else {
		throw new Notvote();
	}
}


}

