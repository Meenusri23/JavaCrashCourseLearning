package com.meenu.Constructors_Learning;

public class ParameterizedConstructor {
	
	String Animal_Name;
	String Animal_Type;
	
	ParameterizedConstructor(String Name,String Type){
		Animal_Name = Name;
		Animal_Type = Type;
	}

	public void SayAboutAnimal() {
		System.out.println("Animal name is " +Animal_Name+ " and Animal Type is " +Animal_Type+ ".");
		
	}
	public static void main(String[] args) {
		
		ParameterizedConstructor animal1 = new ParameterizedConstructor("Lion", "Carnivores");
		animal1.SayAboutAnimal();
		ParameterizedConstructor animal2 = new ParameterizedConstructor("Rabbit", "Herbivores");
		animal2.SayAboutAnimal();
	}

}
