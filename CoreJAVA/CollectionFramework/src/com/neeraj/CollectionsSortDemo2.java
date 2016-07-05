package com.neeraj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSortDemo2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("a");
		a.add("d");
		a.add("z");
		a.add("w");
		a.add("k");
		a.add("p");
		System.out.println(a);
		Collections.sort(a);
		Iterator i=a.iterator();
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
	}

}
