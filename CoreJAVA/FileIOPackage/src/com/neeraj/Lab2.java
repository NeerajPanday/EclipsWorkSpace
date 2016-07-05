package com.neeraj;

import java.io.File;

public class Lab2 {

	public static void main(String[] args) {
		int count=0;
		File f=new File("E:\\");
		String[] s=f.list();
		for(int a=0;a<=s.length;a++){
			count++;
			
		}
       System.out.println("total no :"+count);
       System.out.println(f);
	}

}
