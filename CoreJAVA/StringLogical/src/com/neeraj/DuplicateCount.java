package com.neeraj;

public class DuplicateCount {

	public static void main(String[] args) {
		String s="Neeraj";
		char[] s1=s.toCharArray();
		boolean b=true;
		int count=1;
		for (int i = 0; i < s1.length; i++) {
			if(b){
				for (int j = i-1; j >=0; j--) {
					if(s1[i]==s1[j]){
						b=false;
						break;
					}
				}
			}
			if(b){
				for (int j = i+1; j < s1.length; j++) {
					if(s1[i]==s1[j]){
						count++;
					}
				}
				System.out.println(s1[i]+" "+count);
				count=1;
			}
			b=true;

		}
	}

}
