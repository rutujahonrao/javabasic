package com.pro.wings;

public class MethodCalling {

	public static void main(String... args) { // args ---> local variable that we can write anything, [] can be write
												// ... which is var-arg
		System.out.println("Main method started...");

		getMessage();
		System.out.println("Main method ended...");

	}

	static void getMessage() {

		MethodCalling m1 = new MethodCalling();
		m1.display();
		System.out.println("Static to non- static...Object req");

		System.out.println("Static to static...Direct");
	}

	void display() {
		MethodCalling m2 = new MethodCalling();
		m2.show();

		System.out.println("Non-static to non- static...obj req");

		show2();

	}

	void show() {
	}

	static void show2() {
		System.out.println("Non-static to static...direct...");
	}
}
