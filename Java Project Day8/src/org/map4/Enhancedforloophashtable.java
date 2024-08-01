package org.map4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Enhancedforloophashtable {
	public static void main(String[] args) {
		Map<String,String>m=new java.util.Hashtable<>();
		m.put("apple","Selenium");
		m.put("bat","framework");
		m.put("cat","oracle");
		m.put("dog","corejava");
		m.put("eat","jira");
		System.out.println(m);
		Set<Entry<String, String>> entrySet = m.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
