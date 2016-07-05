package com.neeraj;

import java.util.Scanner;

public class NaturalNo {

	public static void main(String[] args) {
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter natural no");
		n=s.nextInt();
		System.out.println("Display 1st natural number");
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
		}

	}

}
