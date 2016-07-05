package com.neeraj;

public class Lab4 {
public static void main(String...as)
{
	String s="Neeraj Kumar Pandey";
	System.out.println(s);
    String arr[]=s.split(" ");
    for(int i=arr.length-1;i>=0;i--){
    	String s1=arr[i];
    	System.out.print(s1);
    	System.out.print(" ");
    	
	}
    
}
}
