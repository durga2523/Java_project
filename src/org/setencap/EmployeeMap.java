package org.setencap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeMap extends EcapMap {
    public static void main(String[] args) {
        EmployeeMap e1 = new EmployeeMap();
        e1.setName("John Doe");
        e1.setAge(30);
        e1.setPhoneno(1234567890L);

        EmployeeMap e2 = new EmployeeMap();
        e2.setName("John");
        e2.setAge(35);
        e2.setPhoneno(12345678877890L);

        EmployeeMap e3 = new EmployeeMap();
        e3.setName("Doe");
        e3.setAge(25);
        e3.setPhoneno(12345678997970L);

        Map<Integer, EmployeeMap> m = new LinkedHashMap<>();
        m.put(1, e1);
        m.put(2, e2);
        m.put(3, e3);
// Set<Entry<Integer, EmployeeMap>> entrySet = m.entrySet();
     for (Map.Entry<Integer, EmployeeMap> entry : m.entrySet()) {
          Integer key = entry.getKey();	
          EmployeeMap emp = entry.getValue();
           System.out.println("Key: " + key);
           System.out.println("Name: " + emp.getName());
           System.out.println("Age: " + emp.getAge());
           System.out.println("Phone Number: " + emp.getPhoneno());
        }
    }
}
