package com.neeraj.SB;

public class StringBufferDemo4 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
		sb.append("Honey");
		sb.append("Boney");
		sb.append("Toko");
		sb.append("Toko");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
				
	}
 
}
