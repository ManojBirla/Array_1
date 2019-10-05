package com.nt.string_01;

import java.util.Arrays;

public class FInd_Duplicate_Char_03 {

	public static void main(String[] args) {
		String s = "simplepstt";
		char[] s1=s.toCharArray();
		int count=0;
		char temp=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s1[i]==s1[j]){
					count=count+1;
					System.out.println(s1[i]);
					break;
				}
				temp=s1[i];
			}
			
		}
		//System.out.println(temp+" "+count);
		
	}

}
