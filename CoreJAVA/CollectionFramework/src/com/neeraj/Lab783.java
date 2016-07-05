package com.neeraj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab783 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		System.out.println(col.add("Neeraj"));
		System.out.println(col.add("kumar"));
		System.out.println(col.add("Pandey"));
		System.out.println(col);
		Iterator i=col.iterator();
		System.out.println(i);
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
			if(obj.equals("kumar"))
				i.remove();
			//System.out.println(obj);
		}
		System.out.println(col);
	}
}
