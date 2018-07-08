package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//It is similar to HashMap but it is Synchronized
		//Stores data in basis of Key and Value
		//Key-->Object--HashCode--->Value [Key is stored in the form of Object and In java Objectis having a unique hash code]
		// Use Enumeration or EntrySet  as it is not like Arraylist where Insertion order is preserved
		//no null key and no null value---> it will throw null pointer exceptions
		
		
		
		Hashtable h1= new Hashtable();
		h1.put(1,"Tom");
		h1.put(2,"Jerry");
		h1.put(3,"Harry");
		//create Clone/Shallow copy
		Hashtable h2= new Hashtable();
		h2=(Hashtable)h1.clone();
		h1.clear();
		
		System.out.println("The value from h1:"+ h1);
		System.out.println("The value from h2:"+ h2);
		
		//Contains value
		
		Hashtable h3=new Hashtable();
		h3.put("A", "Selenium");
		h3.put("B", "Sahi");
		h3.put("C", "RFT");
		
		if(h3.containsValue("Sahi")){
			System.out.println("yes calue is present");
		}
		
		//Print all the key and value of the Hashtable
		Enumeration e=h3.elements();
		System.out.println("Print values from h3");
		while(e.hasMoreElements()){
			System.out.print(e.nextElement());
		}
		// Print using entryset
		Set s=h3.entrySet();
		System.out.println(s);
		
		//check both hastable are equal or not
		Hashtable h4=new Hashtable();
		h4.put("A", "Selenium");
		h4.put("B", "Sahi");
		h4.put("C", "RFT");
		
		if(h3.equals(h4)){
			System.out.println("Yes h3 and h4 are equal");
		}
		
		//get key 
		System.out.println(h4.get("A"));
		
		//Hashcode value of hashtable
		System.out.println(h3.hashCode());
		
		
		
	}

}
