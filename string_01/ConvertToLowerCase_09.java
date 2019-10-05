package com.nt.string_01;

import java.util.Arrays;

public class ConvertToLowerCase_09 {

	public static void main(String[] args) {
		String s = "Www.TekLeads.com";
		String[] s_arr=s.split("");
		System.out.println(Arrays.toString(s_arr));
		String[] s1 = new String[s.length()];
		String new_s=null;
		
		int ascii=0;
	    for(int i = 0; i < s_arr.length; i++) {
			ascii=s.charAt(i);
			if(ascii>=97 && ascii<=122 ) {
				String up_text=s_arr[i].toUpperCase();
				s_arr[i]=up_text;
			}
			else {
				String lo_text=s_arr[i].toLowerCase();
				s_arr[i]=lo_text;
			}
			
		}//for
	    new_s=Arrays.toString(s_arr);
	    System.out.println(new_s);
	    


	}//main

}//class
