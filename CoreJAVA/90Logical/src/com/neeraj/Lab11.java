package com.neeraj;

import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		//int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        if(a>0)
        	
        {
        	System.out.println(a+"is positive");
        }else if(a<0){
        	System.out.println(a+"is negative");
        }else{
        	System.out.println(a+"is zero");
        }
	}

}
