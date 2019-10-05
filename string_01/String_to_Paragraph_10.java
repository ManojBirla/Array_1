package com.nt.string_01;

import java.util.Arrays;

public class String_to_Paragraph_10 {

	public static void main(String[] args) {
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    int wrap=6;
	    int len=s.length();
	   
	    int count=0;
	    String textwrap="";
	    for (int i = 0; i < len; i++) {
			count++;
			textwrap=textwrap+s.charAt(i);
			if(wrap==count) {
				System.out.println(textwrap);
				count=0;
				textwrap="";
			}
			
		}
	    System.out.println(textwrap);
	    
	    
	}

}// class
