package com.neeraj;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap m=new LinkedHashMap();
        m.put("Neeraj", "Pandey");
        m.put("Hello", 1000);
        m.put("Bala", 1000);
        m.put("Neeraj", 1000);
      System.out.println(m);
        Set s=m.keySet();
        //System.out.println(s);
        Collection c=m.values();
        //System.out.println(c);
        Set s1=m.entrySet();
        //System.out.println(s1);
        Iterator i=s1.iterator();
        while(i.hasNext()){
             Map.Entry m1=(Map.Entry)i.next();
            System.out.println(m1.getKey()+"  "+m1.getValue());
        	
        }
        //System.out.println(m);
        HashMap m2=new HashMap();
        Map c1=Collections.synchronizedMap(m2);
        //System.out.println(c1);
       
	}

}
