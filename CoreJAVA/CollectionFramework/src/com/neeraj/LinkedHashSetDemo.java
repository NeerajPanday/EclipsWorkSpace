package com.neeraj;
//import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet h=new LinkedHashSet();
		h.add("neeraj");
		h.add("Kumar");
		h.add("Pandey");
		h.add(null);
		h.add(10);
		System.out.println(h.add("neeraj"));
		System.out.println(h); 
		//System.out.println(h.capacity());
		

	}

}
