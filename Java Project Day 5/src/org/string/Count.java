package org.string;

public class Count {
public static void main(String[] args) {
	String w="Welcome";
	int vowelsCount = 0;
    int consonantsCount = 0;

    for (int i = 0; i < w.length(); i++) {
        char c = Character.toLowerCase(w.charAt(i));

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowelsCount++;
        } else if (c >= 'a' && c <= 'z') {
            consonantsCount++;
        }
    }

    System.out.println("Vowels count: " + vowelsCount);
    System.out.println("Consonants count: " + consonantsCount);
}
}


