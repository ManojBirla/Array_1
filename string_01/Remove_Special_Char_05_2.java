package com.nt.string_01;

public class Remove_Special_Char_05_2 {

	public static void main(String[] args) {
		String s = "$ja!va$&st%arP";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
