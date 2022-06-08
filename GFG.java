package com.pro.wings;

public class GFG {
	public static void main(String[] args) {
		System.out.println("Main method started...");
		
		//	static to non static
		C c1 = new C();
		c1.m3();
		
		//static to static
//		A a1 =  new A();
//		a1.m1();	(you can also call method by object ref but it is costly process & memory wastage...
		A.m1();
		
		System.out.println("main method ended...");
	}
}

class A {
	static void m1() {
		System.out.println("static to static...class reference req");
	}
} 

class B {
	static void m2() {
		System.out.println("non static to static...class refe req when method us in another class "
				+ "and if it is in same class no ref req...");
	}
}

class C {
	void m3() {
		System.out.println("static to non static...object reference req...");
	
		//non static to static
		B.m2();
		
		
		//non static to non static		
		D d1 = new D();
		d1.m4();
		
	}
}

class D{
	void m4() {
		System.out.println("non static to non static...object req");
	}
}
