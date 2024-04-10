package com.meenu.Constructors_Learning;

public class ConstructorOverloading {
	
	String Drawing_Shape;
	
	ConstructorOverloading(){
		System.out.println("Object Created for the class ConstructorOverloading.");
	}
	
	ConstructorOverloading(String Shape){
		Drawing_Shape = Shape;
		System.out.println("Drawing " +Drawing_Shape+ " shape.");
	}

	public static void main(String[] args) {
		ConstructorOverloading overloading = new ConstructorOverloading();
		ConstructorOverloading overloading2 = new ConstructorOverloading("Rectangle");


	}

}
