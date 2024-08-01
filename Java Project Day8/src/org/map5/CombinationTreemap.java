package org.map5;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CombinationTreemap {
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
	Set<Entry<Character, Integer>> entrySet = m.entrySet();
	for (Entry<Character, Integer> entry : entrySet) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	}
}
