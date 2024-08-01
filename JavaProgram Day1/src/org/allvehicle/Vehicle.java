package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void VehicleNecessary() {
		System.out.println("Vehicle necessary");

	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		TwoWheeler t = new TwoWheeler();
		ThreeWheeler w = new ThreeWheeler();
		FourWheeler f = new FourWheeler();
		v.VehicleNecessary();
		t.bike();
		t.cycle();
		w.auto();
		f.car();
		f.bus();
	}
}
