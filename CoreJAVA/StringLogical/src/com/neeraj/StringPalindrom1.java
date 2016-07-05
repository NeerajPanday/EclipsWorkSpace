package com.neeraj;

public class StringPalindrom1 {

	public static void main(String[] args) {
		String s="madama";
		String rev="";
		String arr[]=s.split("");
		for(int i=arr.length-1;i>=0;i--){
			 rev=rev+arr[i];	
			 
		}
		System.out.println(rev);
		if(rev.equals(s)){
			System.out.println("this is polindrom");
		}else{
			System.out.println("this is not polyndrom");
		}
	}

}
