package com.neeraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableDemo implements Comparable {
	String name;
	int id;
	public ComparableDemo(String name, int id) {
		this.name = name;
		this.id = id;
		}
		public int compareTo(Object o) {
			ComparableDemo d = (ComparableDemo)o;
			return this.name.compareTo(d.name);
		}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new ComparableDemo("Neeraj", 5));
		al.add(new ComparableDemo("Vivekanand", 4));
		al.add(new ComparableDemo("Saroj", 3));
		al.add(new ComparableDemo("Purushottam", 7));
		al.add(new ComparableDemo("Rajesh", 9));
		Collections.sort(al);
		System.out.println("Name..........sId");
		System.out.println();
		Iterator it = al.iterator();
		while(it.hasNext()){
			ComparableDemo cd = (ComparableDemo) it.next();
			System.out.println(cd.name+"  "+cd.id);		
		}
	}
}
