package com.neeraj;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter year value");
		int x=in.nextInt();
		if(x%4==0){
			System.out.println(x+"is leap year");
		}else{
			System.out.println("this is not leap year");
		}

	}

}
