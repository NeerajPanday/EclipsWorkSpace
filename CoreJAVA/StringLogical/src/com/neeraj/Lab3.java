package com.neeraj;

public class Lab3 {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String arr[]=s.split(" ");
		String s1="";
       for (int i = 0; i < arr.length; i++) {
    	   s1=arr[i];
    	   System.out.println(s1);
    	   String arr1[]=s1.split("");
    	   for (int j = arr1.length-1; j >=0; j--) {
			//System.out.print(arr1[j]);
		}
    	   System.out.print (" ");
    	   //s1="";
		
	}
       
		}
	


	}


