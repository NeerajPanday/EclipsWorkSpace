package com.neeraj;

public class Lab5 {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String rev="";
		String arr[]=s.split(" ");
		for (int i=arr.length-1; i>=0 ; i--) {
			 rev=rev+arr[i];
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
	}


