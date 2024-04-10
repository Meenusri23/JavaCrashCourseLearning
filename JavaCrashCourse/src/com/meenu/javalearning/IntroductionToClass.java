package com.meenu.javalearning;
public class IntroductionToClass {
	
	//Using Long wrapper class instead long and Integer wrapper class instead of int 
	
	Long AccNumber = 123647647989l;
	
	String HolderName = "Meenakshi Srinivasan";
	
	Integer AccBalance = 10000;
	
	public void getBalance() {
		System.out.println("Balance is : "+AccBalance);
		
	}

	public static void main(String[] args) {
		IntroductionToClass class1 = new IntroductionToClass();
		class1.getBalance();
	}

}
