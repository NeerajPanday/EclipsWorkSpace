package com.regularexpressiondemo;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobNoFromFile {

	public static void main(String[] args)throws Exception {
		PrintWriter out=new PrintWriter("output.txt");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        String line=br.readLine();
        while(line!=null)
        {
        	Matcher m=p.matcher(line);
        	while(m.find())
        	{
        		out.println(m.group());
        	}
        	line=br.readLine();
        }
        out.flush();
	}

}
