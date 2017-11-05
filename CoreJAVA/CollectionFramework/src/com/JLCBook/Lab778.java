package com.JLCBook;

import java.util.Enumeration;
import java.util.Vector;

public class Lab778 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Neeraj");
		v.add("Kumar");
		v.add("Pandey");
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
		Object o=(Object)e.nextElement();
		System.out.println(o);
		}			
	}
}
