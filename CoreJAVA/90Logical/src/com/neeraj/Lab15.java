package com.neeraj;

import java.util.Scanner;

public class Lab15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=s.nextInt();
		System.out.println("Enter 2nd no");
		int b=s.nextInt();
		System.out.println("Enter 3rd no");
		int c=s.nextInt();
		System.out.println(a+" "+b+" "+c);
		if(a>b&&a>c){
			System.out.println(a+"is greater");
		}else if(b>a&&b>c){
			System.out.println(b+" is greater");
		}else{
			System.out.println(c+"is greater");
		}
		

	}

}
