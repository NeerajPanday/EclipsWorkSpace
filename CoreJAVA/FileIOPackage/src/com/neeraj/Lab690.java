package com.neeraj;

import java.util.Enumeration;
import java.util.Properties;

public class Lab690 {

	public static void main(String[] args) {
		System.out.println("\n Accessing all property");
        Properties p=System.getProperties();
        Enumeration enm=p.propertyNames();
        while(enm.hasMoreElements()){
        	String pnme=enm.nextElement().toString();
        	String val=System.getProperty(pnme);
        	
        	System.out.println(val+" "+pnme);
        }
	}

}
