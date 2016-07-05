package com.neeraj;

import java.util.*;

public class Lab789 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("neeraj");
		list.add("Kumar");
	    list.add("pandey");
	    System.out.println(list);
        list.add(1,"NEERAJ");
        list.add(2,"KUMAR");
        list.add("PANDEY");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        int x=list.indexOf("KUMAR");
        System.out.println(x);
        int y=list.lastIndexOf("pandey");
        System.out.println(y);

	}

}
