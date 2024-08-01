package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("Wifi name is BroadBand");
		
	}
	public static void main(String[] args) {
		Wifi w=new Wifi();
		MobileData m=new MobileData();
		Lan l=new Lan();
		Wireless c=new Wireless();
		w.wifiName();
		m.dataName();
		l.lanname();
		c.modamName();
	}

}
