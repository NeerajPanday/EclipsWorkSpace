package com.regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression9
{
public static void main(String[] args)
{
	Pattern p=Pattern.compile("a");
	Matcher m=p.matcher("abaabaaab");
	if(m.find())
	{
		System.out.println(m.start()+"*"+m.end()+"*"+m.group());
			}
	
}
}
