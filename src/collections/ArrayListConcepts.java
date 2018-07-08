package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static <E> void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	//System.out.println(al.size());
	al.add(10);
	al.add(0, 5);	
	System.out.println(al.get(3));
	System.out.println(al.size());
	
	for (int i=0;i<al.size();i++){
		System.out.println(al.get(i));
	}
	
	System.out.println("**************************");
	//Can store any type of value
	ArrayList<E> al1= new ArrayList<E>();
	
	System.out.println("**************************");
	Employee e1= new Employee("sachita",101,25);
	Employee e2= new Employee("susita",102,25);
	Employee e3= new Employee("sneha",131,25);
	
	ArrayList<Employee> employeeList=new ArrayList<Employee>();
	employeeList.add(e1);
	employeeList.add(e2);
	employeeList.add(e3);
	
	Iterator<Employee> it= employeeList.iterator();
	for(Employee e:employeeList){
		if(it.hasNext()){
			System.out.print(e.name+" ");
			System.out.print(e.empid+" ");
			System.out.print(e.age+" ");
			System.out.println();
		}
	}
	
	System.out.println("**************************");
	//addAll()
	
	ArrayList<String> al01= new ArrayList<String>();
	al01.add("aaa");
	al01.add("bbb");
	al01.add("ccc");
	System.out.println(al01.size());
	ArrayList<String> al02= new ArrayList<String>();
	al02.add("111");
	al02.add("222");
	al02.add("aaa");
	System.out.println(al02.size());
	
	al01.addAll(al02);
	System.out.println("Now the size of arraylist changed to:" +al01.size());
	
	System.out.println("#1 for each loop");
	Iterator<String> al01It=al01.iterator();
	for(String str:al01){
		System.out.println(str);
	}
	
	System.out.println("#2 while loop");
	int j = 0;
	while (al01.size() > j) {
		System.out.println(al01.get(j));
		j++;
	}
	
	System.out.println("#3 iterator");
	Iterator<String> iterator = al01.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	System.out.println("**************************");
	//removeAll()
	
	al01.removeAll(al02);
	Iterator<String> itre=al01.iterator();
	while(itre.hasNext()){
		System.out.println(itre.next());
	}
	
	System.out.println("**************************");
	//retainAll()--give the common between lists
	ArrayList<String> al03= new ArrayList<String>();
	al03.add("000");
	al03.add("111");
	ArrayList<String> al04= new ArrayList<String>();
	al04.add("111");
	al04.add("777");
	al03.retainAll(al04);
	Iterator<String> itreo=al03.iterator();
	while(itreo.hasNext()){
		System.out.println(itreo.next());
	}
	
	}
}