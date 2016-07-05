package com.neeraj.Array;

public class Lab241 {

	public static void main(String[] args) {
		String arr[]=new String[3];
			System.out.println(arr.length);
			for(int i=0;i< arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			arr[0]="Sri";
			arr[1]="Hari";
			arr[2]="java";
			for(int i=2;i<=arr.length;i--)
			{
				System.out.println(arr[i]);
			}
	}

}
