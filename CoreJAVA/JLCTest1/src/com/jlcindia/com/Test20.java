package com.jlcindia.com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test20 {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		Map t1=Collections.synchronizedMap(m);
		System.out.println(t1);
		//int h=m.size();
		m.put("A", 89);
		m.put("a", 98);
		m.put("B", 76);
		m.put("D", 23);
		int h=m.size();
		System.out.println(h);
		System.out.println(m);
		Set s1=m.keySet();
		System.out.println(s1);
		Collection s2= m.values();
		System.out.println(s2);
		Set s=m.entrySet();
		Iterator t=s.iterator();
		while(t.hasNext()){
			Map.Entry m2=(Entry) t.next();
			System.out.println(m2.getKey()+" "+m2.getValue());
		}
		

	}

}
