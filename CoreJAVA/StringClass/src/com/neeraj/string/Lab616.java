package com.neeraj.string;

public class Lab616 {

	public static void main(String[] args) {
	   String s1="jlc";
	   String s2=new String("jlc");
	   System.out.println(s1==s2);
	   String s3=s2.intern();
	   System.out.println(s1.hashCode());
	   System.out.println(s3.hashCode());
	   System.out.println(s2.hashCode());
	  
	   System.out.println(s2==s3); 
	   System.out.println(s1==s3);
	   
	}

}
