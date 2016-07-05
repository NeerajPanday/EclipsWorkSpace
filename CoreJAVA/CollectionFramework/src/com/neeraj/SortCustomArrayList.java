package com.neeraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCustomArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		Collections.sort(al, new MyComparator());
		System.out.println(al);

	}

}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}

	
}
