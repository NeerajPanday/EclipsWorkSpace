package com.neeraj;

import java.util.Scanner;

public class Lab14 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first no");
		int num1=s.nextInt();
		System.out.println("Enter second no");
		int num2=s.nextInt();
		System.out.println("ok");
		if(num1>num2){
			System.out.println("num1 is greater");
		}else if(num1==num2){
			System.out.println("no is equal");
		}else{
			
			System.out.println("num2 is greter");
		}
	}

}
