package com.neeraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		
		l.add(new Employee("Neeraj",6));
		l.add(new Employee("Viveka",5));
		l.add(new Employee("Saroj",7));
		l.add(new Employee("Preity",8));
		
		Collections.sort(l,new SortByName());
		
		System.out.println("Sorting By Name: ");
		System.out.println();
		Iterator itr1 = l.iterator();
		while(itr1.hasNext()){
			Employee e1=(Employee) itr1.next();
			System.out.println(e1.name+ "  "+e1.id);
		}
		
		System.out.println("Hello............");
		System.out.println("Hiiiii...........");
		
		
Collections.sort(l,new SortById());
		
		System.out.println("Sorting By ID: ");
		System.out.println();
		Iterator itr2 = l.iterator();
		while(itr2.hasNext()){
			Employee e2=(Employee) itr2.next();
			System.out.println(e2.name+ "  "+e2.id);
		}	
	}
}
