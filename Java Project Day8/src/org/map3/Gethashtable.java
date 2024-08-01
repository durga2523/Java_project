package org.map3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Gethashtable {
	public static void main(String[] args) {
		Map<String,String>m=new java.util.Hashtable<>();
		m.put("apple","Selenium");
		m.put("bat","framework");
		m.put("cat","oracle");
		m.put("dog","corejava");
		m.put("eat","jira");
		System.out.println(m);
		Collection<String> valueSet = m.values();
		System.out.println(valueSet);
}
}
