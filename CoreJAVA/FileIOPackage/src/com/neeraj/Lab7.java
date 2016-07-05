package com.neeraj;

public class Lab7 {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String[] s1=s.split("");
		String rev="";
		for(int i=0;i<=s1.length-1;i++)
		{
			//System.out.println(s1[i]);
			
			
			for (int j=s1[i].length()-1;j>=0;  j--) {
				rev=rev+s1[i].charAt(j);
				System.out.println(rev);
				}
			rev=rev+"";
		}
	
//System.out.println(rev);
	}


}
