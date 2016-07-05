package com.regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepresentAllMobNumbers {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[7-9][0-9]{9}");
		//System.out.println("Enter your mob no:");
        Matcher m=p.matcher(args[0]);
        
        if(m.find()&& m.group().equals(args[0]))
        {
        	System.out.println("this valid mob no");
        }else
        {
        	System.out.println("invalid mob no");
        }
	}

}
