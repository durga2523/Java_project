package org.phone;

public class InternalStorage {
	private void processorName() {
		// TODO Auto-generated method stub
System.out.println("Processor name : Acer5");
	}
	private void ramSize() {
		// TODO Auto-generated method stub
System.out.println("Ram Size : 20gb ");
	}
public static void main(String[] args) {
	InternalStorage i=new InternalStorage();
	ExternalStorage e= new ExternalStorage();
	i.processorName();
	i.ramSize();
	e.size();
}
}
