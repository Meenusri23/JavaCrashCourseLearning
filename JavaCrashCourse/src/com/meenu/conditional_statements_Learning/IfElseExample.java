package com.meenu.conditional_statements_Learning;

public class IfElseExample {
	
	Boolean isCupEmpty = false;

	public static void main(String[] args) {
		
		IfElseExample ifelseExample = new IfElseExample();
		
		if(ifelseExample.isCupEmpty) {
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("Drink the coffee");
		}

	}

}
