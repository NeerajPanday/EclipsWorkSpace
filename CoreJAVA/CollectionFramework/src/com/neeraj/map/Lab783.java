package com.neeraj.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab783 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Neeraj");
		col.add("Kumar");
		col.add("Pandey");
		col.add("Achu");
		Iterator r=col.iterator();
		while(r.hasNext()){
			Object o=r.next();
			System.out.println(o);
			if(o.equals("Achu"))
			{
			r.remove();}
		}
       System.out.println(col);
	}

}
