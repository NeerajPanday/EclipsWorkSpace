package com.neeraj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab6 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("E:\\neeraj\\abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String reader=br.readLine();
		while(reader!=null){
			System.out.println(reader);
			
		}
		System.out.println(reader);
		
		}
		
   
	}


