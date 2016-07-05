package com.regularexpressiondemo;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("1,99,9888",",");
     while(st.hasMoreTokens())
    	 System.out.println(st.nextToken());
	}

}
