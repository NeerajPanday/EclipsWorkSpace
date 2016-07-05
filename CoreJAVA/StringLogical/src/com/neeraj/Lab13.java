package com.neeraj;

public class Lab13 {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String rev="";
		//System.out.println(s);
		String[] s1=s.split(" ");
		for (int i = 0; i <= s1.length-1; i++) {
			//System.out.print(s1[i]);
			//System.out.println(" ");
			for (int j =s1[i].length()-1; j>=0; j--) {
			rev=rev+s1[i].charAt(j);
			}
			//System.out.println(rev+" ");
		}
		
		System.out.println(rev);
	}}


