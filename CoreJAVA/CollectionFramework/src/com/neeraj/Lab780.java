package com.neeraj;

import java.util.*;

public class Lab780 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		System.out.println(col);
		System.out.println(col.size());
		System.out.println(col.isEmpty());
		col.add("Neeraj");
		col.add("Pandey");
		col.add("Kumar");
		col.add("Pandey");
		System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.isEmpty());
        System.out.println(col.iterator());
        
        Object arr[]=col.toArray();
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        	arr[0]="jlc";
        	System.out.println(arr[i]);
        }
        System.out.println(col);
        System.out.println(col.contains("Pandey"));
        System.out.println(col.contains("Ravi"));
        System.out.println(col.remove("Pankaj"));
        System.out.println(col.remove("Pandey"));
        System.out.println(col);
        System.out.println(col.remove("Pandey"));
        System.out.println(col);
        col.clear();
        System.out.println(col);
        System.out.println(col.size());
	}

}
