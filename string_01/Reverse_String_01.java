package com.nt.string_01;

import java.util.Arrays;

public class Reverse_String_01 {

	public static void main(String[] args) {
		String s = "tekleads";
		char s2;
		System.out.println(s);
		for (int i = s.length() - 1; i > 0; i--) {
			s2 = s.charAt(i);
			System.out.print(s2 + " ");
		}
	}

}
