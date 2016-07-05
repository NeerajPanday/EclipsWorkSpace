package com.regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakeValidIdenifiers {

	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]*");
        Matcher m=p.matcher(args[0]);
        	if(m.find()&& m.group().equals(args[0]))
        	{
        	System.out.println("valid identifiers");
        		}
        	else
        		{
        			System.out.println("pls make valid idetifiers");
        		}
	}

}
