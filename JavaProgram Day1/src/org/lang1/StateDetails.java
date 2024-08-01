package org.lang1;

public class StateDetails extends LanguageInfo {
public void southIndia() {
	System.out.println("SouthIndia");
}
public void northIndia() {
	System.out.println("NorthIndia");
}
public static void main(String[] args) {
	StateDetails s= new StateDetails();
	s.tamilLanguage();
	s.englishlanguage();
	s.hindiLanguage();
	s.southIndia();
	s.northIndia();
}
}
