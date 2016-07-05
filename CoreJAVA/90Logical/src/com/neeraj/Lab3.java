package com.neeraj;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=st.next();
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			System.out.println(ch1);
		}

	}

}
