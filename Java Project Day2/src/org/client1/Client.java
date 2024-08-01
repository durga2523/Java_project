package org.client1;

import org.company2.Company;

public class Client extends Company {
public void clientname() {
	System.out.println("Client name is Durga");
}
public static void main(String[] args) {
	
	Client c=new Client();
	c.companyname();
	c.clientname();
}
}
