
package com.neeraj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class ArraySort1 {

	public static void main(String[] args) {
		int[] a={10,15,20,25};
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		for(int a1:a){
		System.out.println(a1);}
	}
	
}
class MyCompa implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i1.compareTo(i2);
	}
}