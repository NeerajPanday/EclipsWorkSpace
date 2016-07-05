package com.neeraj;

import java.util.Scanner;

public class SumOfNaturalno {

	public static void main(String[] args) {
		int n,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		n=s.nextInt();
		while(i<=n){
			n=n+i;
			i++;
		}
        System.out.println("Sum"+i);
	}

}
