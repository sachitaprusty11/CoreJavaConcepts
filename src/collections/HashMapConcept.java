package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		//Hash Map is a class which implements Map Interface
		//Extend Abstract Map
		//It contains only unique element
		//It store data in Key and value form
		//It can have one and only one null key but can have multiple null values
		//It maintains no order
		//HaspMap is non synchronised- that mean hashmap can be accessed by multiple thread at the same time
		// so the performance will be faster--Not ThreadSafe
		//concurrent modification exception:-- Fast Fail
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2,"QTP");
		hm.put(3,"Sahi");
		System.out.println(hm.get(1));
		
		System.out.println("****************************************");
		/*
		 o/p:- 1=Selenium
				2=QTP
				3=Sahi
 
		 */
		for(Entry m:hm.entrySet()){
			System.out.println(m);
		}
		System.out.println("****************************************");
		//remove can by done by Key as it does not maintain by any specific order , it works with Key
		
		hm.remove(1);
		System.out.println(hm);
		
		System.out.println("****************************************");
		//userdefinetype
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		Employee e1= new Employee("sachita",101,25);
		Employee e2= new Employee("susita",102,25);
		Employee e3= new Employee("sneha",131,25);
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer,Employee> n:emp.entrySet()){
			int key=n.getKey();
			Employee e=n.getValue();
			System.out.println("Key info "+key);
			System.out.println(e.age+" "+e.name+" "+e.empid);
			
		}

	}

}
