package com.neeraj;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet(5,3.0f);
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
