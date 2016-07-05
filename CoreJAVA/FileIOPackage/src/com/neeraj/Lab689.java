package com.neeraj;

import java.util.Date;

public class Lab689 {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		Date dt=new Date(time);
		System.out.println(dt);
		String oname=System.getProperty("os.name");
		System.out.println("OsNAME"+oname);
		System.setProperty("os" ,"UNIX");
		String oname1=System.getProperty("os.name");
		System.out.println(oname1);
		
		

	}

}
