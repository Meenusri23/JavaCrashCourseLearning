package com.meenu.conditional_statements_Learning;

public class IfelseifExample {
	
	String myfavhero = "vijaysethupathi";
	
	public void FavheroGuesser() {
		if(myfavhero.equalsIgnoreCase("Thalapathy Vijay")) {
			System.out.println("Is Your fav hero is Thalapathy Vijay?");
		}
		else if(myfavhero.equalsIgnoreCase("Karthik")) {
			System.out.println("Is Your fav hero is karthik?");
		}
		else if(myfavhero.equalsIgnoreCase("Sivakarthikeyan")) {
			System.out.println("Is Your fav hero is Sivakarthikeyan?");
		}
		else if(myfavhero.equalsIgnoreCase("VijaySethupathi")) {
			System.out.println("Is Your fav hero is VijaySethupathi?");
		}
		else {
			System.out.println("Sorry!! I am unable to guess your favourite Hero.");
		}
	}
	
	public static void main(String[] args) {
		IfelseifExample example = new IfelseifExample();
		example.FavheroGuesser();
		
		
	}

}
