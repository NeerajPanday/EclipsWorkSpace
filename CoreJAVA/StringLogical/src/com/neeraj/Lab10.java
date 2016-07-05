package com.neeraj;

public class Lab10 {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String rev="";
		String[] s1=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			for (int j = s1[i].length()-1; j >=0; j--) {
				rev=rev+s1[i].charAt(j);
			}
			
		}
		System.out.println(rev);
	}

}
