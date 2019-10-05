package com.nt.string_01;

import java.util.Arrays;

public class ConvertToLowerCase_09_2{

	public static void main(String[] args) {
		StringBuffer s =new StringBuffer("Www.TekLeads.com");
		//String s="Www.TekLeads.com";
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			Character c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				Character c_upper=Character.toUpperCase(c);
				//s.replace(s.charAt(i), Character.toUpperCase(s.charAt(i)));
				s.replace(i, i+1, Character.toUpperCase(c)+""); 
			}
			else {
				Character c_lower=Character.toLowerCase(c);
				//s.replace(c, c_lower);
				s.replace(i, i+1, Character.toLowerCase(c)+""); 
			}
			
		}	    
		 System.out.println(s);
	}//main

}//class
