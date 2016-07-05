package com.neeraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSortArayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for(int i=0;i<=15;i++)
		{
			al.add(i);
			
		}
       System.out.println(al);
       
       
       Collections.sort(al, new MyCustom());
       System.out.println(al);
       Collections.binarySearch(al, 10, new MyCustom());
       System.out.println(al);
	}

}
class MyCustom implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer s1=(Integer)obj1;
		Integer s2=(Integer)obj2;
		return s2.compareTo(s1);
		
	}
}
