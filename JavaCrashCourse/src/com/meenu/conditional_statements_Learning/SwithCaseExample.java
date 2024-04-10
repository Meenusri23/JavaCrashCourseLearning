package com.meenu.conditional_statements_Learning;

public class SwithCaseExample {
	
	String Hero = "Vijay";
	
	public void HeroOrNot() {
		switch (Hero) {
		case "suriya":
			System.out.println("Suriya is a Hero!");
			break;
		case "Karthick":
			System.out.println("Karthick is a Hero!");
			break;
		case "Ajith":
			System.out.println("Ajith is a Hero!");
			break;
		case "Vijay":
			System.out.println("Vijay is a Hero!");
			break;
		default:
			System.out.println(Hero+ " Sorry i dont know about this person!!");
			
		}
	}

	public static void main(String[] args) {
		SwithCaseExample caseExample = new SwithCaseExample();
		caseExample.HeroOrNot();
	}

}
