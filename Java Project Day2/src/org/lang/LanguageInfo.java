package org.lang;

public class LanguageInfo {

	public void tamilLanguage() {
		System.out.println("LANGUAGES");
		System.out.println("Tamil Language ");

	}

	public void englishLanguage() {
		System.out.println("English Language ");

	}

	public void hindiLanguage() {
		System.out.println("Hindi Language ");

	}

	public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
		StateDetails s=new StateDetails();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		s.southIndia();
		s.northIndia();
	}
	}

