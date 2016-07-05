package com.neeraj;

public class Lab11 {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		String[] s1=s.split("");
		for (int i = s1.length-1; i >=0; i--) {
			rev=rev+s1[i];
		}
		if(rev.equals(s)){
			System.out.println("palindrom");
		}else{
			System.out.println("not palindrom");
		}
	}

}
