package string_learning;

public class StringBufferLearning {
	
	/*
	 * StringBuffer is muttable StringBuffer is synchronized/Thread-Safe.[Multiple
	 * thread cannot access it simultaneously]
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String is Immutable");
		String name = "Meenakshi";
		System.out.println("Appended Name: "+name.concat(" Srinivasan"));
		System.out.println("Original Name: "+name);
		System.out.println("************************");
		System.out.println("StringBuffer is Muttable");
		StringBuffer Name = new StringBuffer("Meenakshi");
		System.out.println("Appended Name :"+Name.append(" Srinivasan"));
		System.out.println("Original Name :"+Name);
		
		//StringBuffer Methods:
		//Reverse o/p: nasavinirS ihskaneeM
		System.out.println("Reverse Name is : " +Name.reverse());
		
		//Replace o/p:Hemakshi
		StringBuffer Replacethis = new StringBuffer("Meenakshi");
		System.out.println("Replace function : "+Replacethis.replace(0, 5, "Hema"));
		
		//delete O/p: Meena
		StringBuffer delete = new StringBuffer("Meenakshi");
		System.out.println("Delete KSHI in the name : " +delete.delete(5,9));
		
		//Insert O/p: Meenakshi
		StringBuffer insert = new StringBuffer("Meena");
		System.out.println("Add KSHI in the name : " +insert.insert(5,"kshi"));
		
		//StringBuffer storage capacity will be printed O/p:25
		System.out.println(Replacethis.capacity());
		
		//Like String in StringBuffer also we have Length, charAt, Substring methods as well
		
	}

}
