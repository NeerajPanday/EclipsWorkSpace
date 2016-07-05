package com.regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression12 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a*");
		String x="ababamajaab";
		Matcher m=p.matcher(x);
		
			for(int i=0;i<=x.length();i++){
				if(m.find())
				{
			System.out.println(m.start()+"."+m.group());
			}
		}

	}

}
