package org.computer.day3;

public class Desktop implements Hardware,Software {
private void desktopModel() {
	System.out.println("DesktopModel");
}

@Override
public void hardwareResources() {
	System.out.println("HardwareResources");
	
}

@Override
public void softwareResouces() {
	System.out.println("SoftwareResouces");
	
}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.hardwareResources();
	d.softwareResouces();
	d.desktopModel();
}
}
