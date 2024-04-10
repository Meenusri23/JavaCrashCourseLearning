package CollectionsConcept;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Meenu");
		list.add("Jashu");
		list.add("Hema");
		list.add("Sri");
		
		//To add a element in head node(start)
		list.addFirst("Angel");

		//To add a element in Tail node(last)
		list.addLast("Devil");
		System.out.println(list);
		
		//To get first element we can use index or getfirst method
		System.out.println("First value in index: "+list.getFirst());
		System.out.println(list.get(0));
		
		//To get first element we can use index or getlast method
		System.out.println("last value in index: "+list.getLast());
		System.out.println(list.get(5));
		
		//Remove First and Last element
		System.out.println(list.removeFirst());
		System.out.println("After Head Element removed " +list);
		System.out.println(list.removeLast());
		System.out.println("After Tail Element removed " +list);
		
		//poll or pollfirst removes 1st element in list
		//System.out.println(list.pollFirst());
		//System.out.println(list);
		
		//poll last to remove last element
		System.out.println(list.pollLast());
		System.out.println(list);
	}

}
