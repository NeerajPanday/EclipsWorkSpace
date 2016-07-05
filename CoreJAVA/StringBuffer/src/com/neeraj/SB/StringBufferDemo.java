package com.neeraj.SB;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmopqrstuvwxyz");
		System.out.println(sb.capacity());
	}
}
