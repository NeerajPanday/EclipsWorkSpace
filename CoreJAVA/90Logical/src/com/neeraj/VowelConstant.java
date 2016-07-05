package com.neeraj;

import java.util.Scanner;

public class VowelConstant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int x=s.nextInt();
        if(x%2==0)
        	System.out.println("vowel");
        else
        	System.out.println("Consonant");
	}

}
