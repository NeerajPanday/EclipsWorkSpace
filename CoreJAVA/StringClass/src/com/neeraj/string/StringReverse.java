package com.neeraj.string;

public class StringReverse {

	public static void main(String[] args) {
		String s1="Neeraj  ";
		System.out.println(s1);
		System.out.println(s1.trim());
		s1=new StringBuffer(s1).reverse().toString();
		System.out.println(s1);
		//StringBuffer s2=new StringBuffer(s1);
	}

}
