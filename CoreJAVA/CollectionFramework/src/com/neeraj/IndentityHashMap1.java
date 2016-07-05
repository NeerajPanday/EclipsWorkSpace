package com.neeraj;

//import java.util.HashMap;
import java.util.IdentityHashMap;

public class IndentityHashMap1 {

	public static void main(String[] args) {
		IdentityHashMap hm=new IdentityHashMap();
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		hm.put(i, "Pankaj");
		hm.put(i1, "Manoj");
		System.out.println(hm);

	}

}
