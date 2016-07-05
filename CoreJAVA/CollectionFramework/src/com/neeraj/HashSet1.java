package com.neeraj;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(null);
		s.add("B");
		s.add("C");
		s.add("E");
		s.add("B");
		s.add(10);
		s.add(null);
		
		System.out.println(s);
		System.out.println(s.add("B"));

	}

}
