package com.neeraj.string;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1=new String("Bhasker");
		String s2=s1.intern();
		System.out.println(s1==s2);
		String s3="Bhaskar";
		System.out.println(s2==s3);
	}
}
