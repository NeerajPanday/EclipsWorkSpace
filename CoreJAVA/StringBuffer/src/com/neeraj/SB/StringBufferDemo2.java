package com.neeraj.SB;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Honeyboney");
		System.out.println(sb.capacity());
        System.out.println(sb.charAt(7));
       // System.out.println(sb.charAt(10));
       // System.out.println(sb.charAt(12));
       sb.setCharAt(10,'A');
       System.out.println(sb);
       
	}
}
