package com.neeraj;

public class Lab1 {
public static void main(String...as){
	String s="Neeraj";
   String rev="";
   for(int i=s.length()-1;i>=0;i--){
	   rev=rev+s.charAt(i);
   }
   System.out.println(rev);
}
}
