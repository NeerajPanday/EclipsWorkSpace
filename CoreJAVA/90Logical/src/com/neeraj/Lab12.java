package com.neeraj;

import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age");
		int sc=s.nextInt();
		if(sc>=18)
			System.out.println("you are eligible");
		else
			System.out.println("you are not eligible"); 
			
	}

}
