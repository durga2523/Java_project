package org.map5;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CombinationHashtable {
	public static void main(String[] args) {
		Map<String,String>m=new java.util.Hashtable<>();
		m.put("apple","Selenium");
		m.put("bat","framework");
		m.put("cat","oracle");
		m.put("dog","corejava");
		m.put("eat","jira");
		Set<Entry<String, String>> entrySet = m.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
