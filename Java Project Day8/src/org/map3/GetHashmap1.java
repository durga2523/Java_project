package org.map3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GetHashmap1 {
	public static void main(String[] args) {
		Map<Integer, String>m=new HashMap<>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		System.out.println(m);
		Collection<String> ValueSet = m.values();
		System.out.println(ValueSet);
	}
}
