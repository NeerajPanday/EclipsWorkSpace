package com.neeraj;

import java.io.File;
import java.io.IOException;

public class Lab1 {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\neeraj");
		file.mkdir();
		boolean b=file.exists();
		System.out.println(b);
		File f=new File("E:\\neeraj","abc.txt");
		boolean b1=f.createNewFile();
		System.out.println(b1);
		
		
	}

}
