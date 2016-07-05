package com.jlcindia.com;

public class Test16 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2=new int[2];
		char[] arr3={'a','b'};
		arr1=arr2;
		//arr1=arr3;
		System.out.println(arr1[0]+":"+arr1[1]);
	}

}
