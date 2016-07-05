package com.regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression7 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\W");
		Matcher m=p.matcher("a1b7 @z#");
		while(m.find())
		{
			System.out.println(m.start()+".."+m.end()+".."+m.group());
		}

	}

}
