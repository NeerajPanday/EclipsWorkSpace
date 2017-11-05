package com.neeraj;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {
		String a="vivekanand";
		String[] s=a.split("");
		//System.out.println(s[0]);
		int count=1;
		boolean b=true;
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for (int i = 0; i < s.length; i++) {
			if(b){
				for (int j = i-1; j >=0; j--) {
					if(s[i]==s[j]){
						b=false;
						break;
					}
				}
			}
			if(b){
				for (int j = i+1; j < s.length; j++) {
					if(s[i]==s[j]){
						count++;
					}
				}
				//map.put(s[i], count);
				count=1;
			}
			b=true;
		}
		System.out.println(map);
	}
}
