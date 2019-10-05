package com.nt.string_01;

import java.util.Arrays;

public class Reverse_Each_String_02 {

	public static void main(String[] args) {
		String s = "java programming languagex";
		String[] s1=s.split(" ");
		char s2;
		System.out.println(s1.length);
		System.out.println(Arrays.toString(s1));
		for(String w:s1) {
			StringBuilder s4=new StringBuilder(w);
			s4.reverse();
			System.out.print(s4+" ");
		}
		
		
	}

}
