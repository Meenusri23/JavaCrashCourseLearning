package string_learning;

public class String_Examples {
	
	/*
	 * String implements 3 interfaces : Serializable, comparable, CharSequence.
	 * String, StringBuffer, StringBilder implements CharSequence (that is they are child of char sequence).
	 * String is Immutable. [not overriable] [once created it will not be changed till garbage collection]
	 */
	

	public static void main(String[] args) {
		
		String name = " Meenakshi "; //created a string using String literal
		
		int num = 3;
		
		//return character value from the particular index ; o/p: 'e'
		System.out.println(name.charAt(1));
		
		//returns String length;o/p: 9
		System.out.println(name.length());
		
		//Checks the equality of the string with the given object; o/p: false
		System.out.println(name.equals("Meenu"));
		
		//Checks the equality of the string with the given object w/o case sensitivity ; o/p: true
		System.out.println(name.equalsIgnoreCase("MEENAKSHI"));
		
		//checks if string is empty or not; o/p: false
		System.out.println(name.isEmpty());
		
		//return true or false based on the given value is present or not; o/p: true
		System.out.println(name.contains("M"));
		
		//take particular portion of String : from beginning index [index provided] to end index; o/p: nakshi
		System.out.println(name.substring(3));
		
		//take particular portion of String begin and end index; o/p:Meena
		System.out.println(name.substring(0, 5));
		
		//Appends the string to the given string ; o/p: Meenakshi S
		System.out.println(name.concat(" S"));
		
		//Replace the existing character with new character; o/p: meenakshi , Hemakshi
		System.out.println(name.replace('M', 'm'));
		System.out.println(name.replace("Meena", "Hema")); 
		
		//find the position of character in the string; o/p: 5
		System.out.println(name.indexOf("k"));
		
		//finds the character specified from the index position; o/p:2
		System.out.println(name.indexOf("e", 2));
		System.out.println(name.indexOf('e', 2));
		
		//finds the character specified from the index position; o/p:5 , 1
		System.out.println(name.indexOf("ksh", 1));
		System.out.println(name.indexOf("eena"));
		
		//Trim will remove from and back spaces of the string; I/p :  Meenakshi  O/p:Meenakshi
		System.out.println(name.trim());
		
		//convert the given data type to String O/p:3 (in string type)
		System.out.println(String.valueOf(num));
		
		//Uppercase to Lowercase and viceversa
		String Uppercase = "MEENAKSHI";
		System.out.println(Uppercase.toLowerCase()); // o/p:meenakshi
		
		String Lowercase = "meenakshi";
		System.out.println(Lowercase.toUpperCase()); // o/p:MEENAKSHI
		
		//returns a Joined String with given delimiter o/p: Learn-Automation-online , 23/04/1999
		System.out.println(String.join("-", "Learn", "Automation","online"));
		System.out.println(String.join("/", "23", "04","1999"));
		
		//Split O/p: Am,
				//	 I,
				//	 Teaching,
				//	 Good?
		String SplitThis = "Am, I, Teaching Good?";
		String[] result = SplitThis.split(" ");
		for (String SplittedWord : result) {
			System.out.println(SplittedWord);
		}
		
		
	}

}
