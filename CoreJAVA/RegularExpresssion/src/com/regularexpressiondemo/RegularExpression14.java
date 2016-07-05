package com.regularexpressiondemo;

import java.util.regex.Pattern;

public class RegularExpression14 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\.");
		String[] s=p.split("www.jlcindia.com");
        for(String s1:s)
        System.out.println(s1);
	}

}
