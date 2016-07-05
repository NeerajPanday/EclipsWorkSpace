package com.neeraj;

import java.util.*;

public class Lab786 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Neeraj");
		col.add("Kumar");
		col.add("Pandey");
		System.out.println(col);
		Collection col1=new ArrayList();
		col1.add("Neeraj");
		col1.add("Pankaj");
		col1.add("Pandey");
		//System.out.println(col.addAll(col1));
		//System.out.println(col);
		//System.out.println(col1);
		//System.out.println(col.containsAll(col1));
		//col.removeAll(col1);
		//System.out.println(col);
		//System.out.println(col1);
		//col1.removeAll(col);
		System.out.println(col1);
		System.out.println(col);
		System.out.println(col.retainAll(col1));
		System.out.println(col);
		System.out.println(col1);
		
		
	}

}
