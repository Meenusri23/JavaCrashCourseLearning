package com.meenu.staticKeyword_Learning;

public class StaticMethod {
	
	public static void method1() {
		System.out.println("This is Static Method");
	}
	
	public void method2() {
		System.out.println("This is Non-Static Method");
	}

	public static void main(String[] args) {
		StaticMethod learning = new StaticMethod();
		method1();
		learning.method2();
	}

}
