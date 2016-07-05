package com.neeraj;

import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the second number");
		int num1=s.nextInt();
        System.out.println("Enter the Second number");
        int num2=s.nextInt();
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println(num1+" "+num2);
	}

}
