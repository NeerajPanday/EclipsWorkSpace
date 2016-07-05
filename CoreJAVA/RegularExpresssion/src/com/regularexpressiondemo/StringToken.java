package com.regularexpressiondemo;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Neeraj kumar Pandey");
		while(st.hasMoreTokens())
       System.out.println(st.nextToken());
	}

}
