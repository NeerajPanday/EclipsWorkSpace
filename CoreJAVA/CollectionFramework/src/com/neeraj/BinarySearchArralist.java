package com.neeraj;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchArralist {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("z");
		al.add("s");
		al.add("d");
		al.add("M");
		System.out.println(al);
		int t=Collections.binarySearch(al, "d");
		System.out.println(t);

	}

}
