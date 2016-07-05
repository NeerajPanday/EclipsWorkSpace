package com.neeraj;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElementList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("a");
		a.add("c");
		a.add("F");
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);

	}

}
