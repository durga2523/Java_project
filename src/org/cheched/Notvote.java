package org.cheched;

public class Notvote extends Exception {
@Override
public String getMessage() {
	String msg="Not Eligible";
	return msg;
}
}
