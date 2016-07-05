package com.neeraj;

import java.util.Scanner;

public class Lab16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your no");
		String x=s.next();
		char ch=x.charAt(0);
		if(ch>=48&&ch<=57){
			System.out.println("this digit");
		}else if(ch>=65&&ch<=122)
		{
			System.out.println("this is charector");
		}else{
			System.out.println("you entered something wronga@");
		}
		
	}

}
