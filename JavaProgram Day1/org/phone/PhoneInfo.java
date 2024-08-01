package org.phone;

public class PhoneInfo {
	private void phoneName() {
System.out.println("Phone name - Readmi 12 5G");
	}
	private void phoneMieiNum() {
		System.out.println("Phone MieiNum - 918229327 ");
			}
	private void camera() {
		System.out.println("Camera - 50MP");
			}
	private void storage() {
		System.out.println("Storage - 128 GB");
	}
	private void osName() {
		System.out.println("OS Name - Android");

	}
	public static void main(String[] args) {
		PhoneInfo b=new PhoneInfo();
		b.phoneName();
		b.phoneMieiNum();
		b.camera();
		b.storage();
		b.osName();
	}
}
