package com.neeraj;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListByWhileLoop {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("c");
		al.add("d");
		al.add("m");
		al.add("o");
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			//String s=(String) i.next();
			//System.out.println(s);
			System.out.println(i.next());
		}

	}

}
