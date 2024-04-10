package com.meenu.Constructors_Learning;

public class NoArgumentConstructor {

	int EmployeeID;

	String EmployeeName;

	// Defining No Argument or Non Parameterized constructor
	NoArgumentConstructor() {
		EmployeeID = 1001;
		EmployeeName = "Meenu";
		System.out.println("NoArgumentConstructor object is created.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgumentConstructor argumentConstructor = new NoArgumentConstructor();
		System.out.println(argumentConstructor.EmployeeID);
		System.out.println(argumentConstructor.EmployeeName);

	}

}
