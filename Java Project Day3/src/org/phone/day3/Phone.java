package org.phone.day3;

public class Phone {
private void PhoneInfo(String name,float ram ) {
	System.out.println(name+"\n"+ram);

}
private void PhoneInfo(float storage,String sim) {
	System.out.println(storage+"\n"+sim);

}
public static void main(String[] args) {
	Phone p=new Phone();
	p.PhoneInfo("Realme c3", 4.00f);
	p.PhoneInfo(64.00f, "Airtel");
}
}
