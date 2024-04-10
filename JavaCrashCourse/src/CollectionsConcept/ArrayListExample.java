package CollectionsConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	public static void Arraylist() {
		
		List<String> Arraylist = new ArrayList<String>();
		//Adding elements to list
		Arraylist.add("BMW");
		Arraylist.add("BENZ");
		Arraylist.add("FORD");
		Arraylist.add("TATA");
		Arraylist.add("MARUTI SUZUKI");
		Arraylist.add("FORD");
		Arraylist.add("TOYATO");
		Arraylist.add("BUGATTI");
		
		System.out.println(Arraylist);
		
		//getting an element from list
		System.out.println(Arraylist.get(2));
		
		//To find the element index
		System.out.println(Arraylist.indexOf("BUGATTI"));
		
		//To find the repeated elements Last occured index
		System.out.println(Arraylist.indexOf("FORD"));//2
		System.out.println(Arraylist.lastIndexOf("FORD"));//5
		
		//Copying a list to new list
		
		List<String> NewList = new ArrayList<String>();
		//Addall function will add a collection to another collection
		NewList.addAll(Arraylist);
		System.out.println(NewList);
		
		//to delete all elements in the list use clear method
		NewList.clear();
		System.out.println(NewList);
		
		//to remeove particular element in list
		Arraylist.remove(2);
		Arraylist.remove("BUGATTI");
		System.out.println(Arraylist);
		
		//Null insertion is allowed
		Arraylist.add(null);
		System.out.println(Arraylist);
		Arraylist.remove(6);
		System.out.println(Arraylist);
		
		//To replace element
		Arraylist.set(0, "CHEVROLET");
		System.out.println(Arraylist);
		
		//to find list is empty or not
		System.out.println(Arraylist.isEmpty());
		
		//Iterate
		System.out.println("Elemets Iterations");
		for (String value : Arraylist) {
			System.out.println("Using foreach loop : "+value);		
		}
		
		System.out.println("-----------------------------------------");
		
		for(int i =0; i<Arraylist.size();i++) {
			System.out.println("Using for loop : " +Arraylist.get(i));
		}
		
		System.out.println("-----------------------------------------");
		
		ListIterator<String> iterator = Arraylist.listIterator();
		//We can use Iterator as like list iterator but only drawback is we can only traverse in forward direction.
		while (iterator.hasNext()) {
			System.out.println("Using List Iterator : " +iterator.next());   
		}
		System.out.println("-----------------------------------------");
		while (iterator.hasPrevious()) {
			System.out.println("Using List Iterator to traverse in reverse : " +iterator.previous());   
		}
		
		
		
	}

	public static void main(String[] args) {
	
		Arraylist();
		

	}

}
