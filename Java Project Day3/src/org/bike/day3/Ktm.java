package org.bike.day3;

public class Ktm implements Bike{
	@Override
	public void cost() {
		System.out.println("Cost : 200000");
	}
	@Override
	public void speed() {
		System.out.println("Speed : 200");
		
	}
	
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}

}
