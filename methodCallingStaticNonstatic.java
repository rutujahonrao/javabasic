package com.pro.wings;

public class methodCallingStaticNonstatic {

	public static void main(String[] args) {
		System.out.println("main mathod started...");
		
		System.out.println("static to static");
		m1();
		
		System.out.println("static to Non static");
		methodCallingStaticNonstatic obj1 = new methodCallingStaticNonstatic();
		
		obj1.m4();
		
		

		
		
		
	}
	
	static void m1() {
		System.out.println("m1 method...");
	}
	
	
	static void m2() {
		System.out.println("m2 method...");
	}
	
	void m3() {
		System.out.println("m3 method...");
		System.out.println("Non static to static");
		m2();
		
		System.out.println("Non static to Non static");
		m4();
		
	}
	
	 void m4() {
		System.out.println("m4 method...");
		
	}

}
