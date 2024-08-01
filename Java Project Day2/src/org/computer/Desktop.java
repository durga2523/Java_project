package org.computer;

public class Desktop extends Computer {
private void desktop() {
	System.out.println("Desktop size is 15.6inch");

}
public static void main(String[] args) {
	Desktop d= new Desktop();
	d.computerModel();
	d.desktop();
}
}
