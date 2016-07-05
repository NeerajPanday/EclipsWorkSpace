package com.neeraj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab5 {

	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("E:\\neeraj\\abc.txt");
        BufferedReader br=new BufferedReader(fr);
        String line="";
        String l=br.readLine();
     while(l!=null){
    	 //System.out.println(l);
    	 line=line+l+" ";
    	 l=br.readLine();
     }
     System.out.println(line);
     	
        

        int count=1;
        boolean b=true;
        String arr[]=line.split(" ");
        for (int i = 0; i < arr.length; i++) {
        	if(b){
        		for (int j = i-1; j >=0; j--) {
        			if(arr[i]==arr[j]){
        				b=false;
        				break;
                  	}
					
				}
        	}
        	if(b){
        		for (int j = i+1; j < arr.length; j++) {
        			if(arr[i]==arr[j]){
        				count++;
        			}
					
				}
        		System.out.println(arr[i]+"  "+count);
        		count=1;
        		b=true;
        	}
			
		}
	
	}
}
