package com.neeraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DupliPreventArrayList {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("a");
		a1.add("a");
		a1.add("z");
		a1.add("w");
		a1.add("k");
		a1.add("p");
		Set s=new HashSet(a1);
		System.out.println(s);
	}

}
