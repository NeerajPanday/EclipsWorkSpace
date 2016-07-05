package com.neeraj;


public class StringPalindrom {

	public static void main(String[] args) {
		String s="neeraj";
		System.out.println(s);
		String rev="";
		for (int i=s.length()-1; i>=0; i--) {
			rev=rev+ s.charAt(i);
			
		}
		System.out.println(rev);
		if(rev.equals(s)){
			System.out.println("this is polindrom");
		}
		else {
			System.out.println("this is not polindrom");
		}
        }
        
	}


