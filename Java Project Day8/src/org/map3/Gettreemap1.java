package org.map3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Gettreemap1 {
	public static void main(String[] args) {
		Map<Character, Integer>m=new TreeMap<>();
		m.put('!', 10);
		m.put('@', 20);
		m.put('#', 30);
		m.put('$', 40);
		m.put('%', 50);
		m.put('^', 60);
		m.put('&', 10);
		m.put('*', 50);
		m.put('(', 40);
		System.out.println(m);
		Collection<Integer> valueSet = m.values();
		System.out.println(valueSet);
	}
}
