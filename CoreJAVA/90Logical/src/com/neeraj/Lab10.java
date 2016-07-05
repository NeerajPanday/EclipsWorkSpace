package com.neeraj;

import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		//convert Farenheit to celsious
       int c,f;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter degre in farenheit");
       f=s.nextInt();
       c=(f-32)*5/9;
       System.out.println("Before Converting"+f);
       System.out.println("After Converting"+c);
       
       
	}

}
