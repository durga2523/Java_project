package org.map1;

import java.util.Map;
import java.util.TreeMap;

public class Hashtable {
	public static void main(String[] args) {
		Map<String,String>m=new java.util.Hashtable<>();
		m.put("apple","Selenium");
		m.put("bat","framework");
		m.put("cat","oracle");
		m.put("dog","corejava");
		m.put("eat","jira");
		m.put("fish","");
		System.out.println(m);
}
}
