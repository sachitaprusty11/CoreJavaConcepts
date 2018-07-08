package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String> ll= 	new LinkedList<String>();
		
		//add()
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("RFT");
		System.out.println(ll);
		//addFirst
		ll.addFirst("First");
		
		//addLast
		ll.addLast("Last");
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(2));
		//set
		ll.set(0, "NewString");
		System.out.println(ll.get(0));
		System.out.println(ll);
		//remove first and last element
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);
		
		System.out.println("***********************");
		for(String str:ll){
			System.out.println(str);
		}
		
		System.out.println("***********************");
		Iterator it=ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("***********************");
		int j=0;
		while(ll.size()>j){
			System.out.println(ll.get(j));
			j++;
		}
		
		//pop- remove first element and print it
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll);
				
	}

}
