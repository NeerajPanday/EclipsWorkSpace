package com.neeraj.Array;

public class Lab275 {

	public static void main(String[] args) {
		if(args.length>=2)
		{
			String st1=args[0];
			String st2=args[1];
			System.out.println(st1+st2);
			int a=Integer.parseInt(st1);
			int b=Integer.parseInt(st2);
			System.out.println(b+a);
			}
		else{
			System.out.println("Enter the two diff value");
		}
	}

}
