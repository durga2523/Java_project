package org.map2;

import java.util.Map;
import java.util.Set;

public class GetHashtable {
	public static void main(String[] args) {
		Map<String,String>m=new java.util.Hashtable<>();
		m.put("apple","Selenium");
		m.put("bat","framework");
		m.put("cat","oracle");
		m.put("dog","corejava");
		m.put("eat","jira");
		System.out.println(m);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
}
}
