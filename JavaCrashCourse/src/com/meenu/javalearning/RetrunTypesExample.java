package com.meenu.javalearning;

public class RetrunTypesExample {
	
	Integer collectedAmount = 2000;
	
	public Integer collectedAmountAndGiveToMe() {
		System.out.println("Jashu I have collected amount " +collectedAmount + " and sent it to you.");
		return collectedAmount;
		
	}
	
	

	public static void main(String[] args) {
		RetrunTypesExample example = new RetrunTypesExample();
		Integer Amount = example.collectedAmountAndGiveToMe();
		System.out.println("Meenu I have Received " +Amount+ " rs.");
		
		

	}

}
