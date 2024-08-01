package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
public void transportForm() {
	System.out.println("Transport Form");
	System.out.println("----------------");

}
public static void main(String[] args) {
	Transport t=new Transport();
	Road r=new Road();
	Air a=new Air();
	Water w= new Water();
	t.transportForm();
	r.bike();
	r.cycle();
	r.bus();
	r.car();
	a.aeroplane();
	a.heliCopter();
	w.boat();
	w.ship();
}
}
