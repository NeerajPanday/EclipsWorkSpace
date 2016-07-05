package com.neeraj;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListByforLoop {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			a.add(i);
			//System.out.println(a);
		}
		System.out.println(a);
		Iterator i=a.iterator();
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
	}

}
