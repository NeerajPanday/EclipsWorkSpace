package com.regularexpressiondemo;

import java.util.regex.Pattern;

public class RegularExpression13 {

	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("\\s");
		String[] s=p.split("Neeraj Kumar Pandey");
		for(String s1:s)
		{
			System.out.println(s1);
		}
	}

}
