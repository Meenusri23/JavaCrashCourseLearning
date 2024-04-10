package com.meenu.Constructors_Learning;

public class DefaultConstructorsExample {
	
	String Name;
	int RollNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructorsExample constructors = new DefaultConstructorsExample();
		
		//default constructors will be created once a new object is initialized in this case we have created object constructors for the DefaultConstructorsExample class.
		//InOrder to return default or natural value of the object we have default constructors
		System.out.println(constructors.Name);
		System.out.println(constructors.RollNo);
	}

}
