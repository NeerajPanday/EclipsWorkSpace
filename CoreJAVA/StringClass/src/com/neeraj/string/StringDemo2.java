package com.neeraj.string;

public class StringDemo2 
{
public static void main(String...as)
{
	char[] ch={'a','b','c'};
	String s=new String(ch);
	System.out.println(ch);
	System.out.println(ch.getClass());
	System.out.println(ch.hashCode());
}
}
