package com.neeraj;

import java.io.File;

public class Lab3 {

	public static void main(String[] args ) {
		int count=0;
		File f=new File("E:\\");
		String[] s=f.list();
		for(int a=0;a<=s.length;a++){
		File f1=new File("f","s1");
		f1.isFile();
		//count++;
		System.out.println(f1);
		System.out.println(count++);
		}
	}

}
