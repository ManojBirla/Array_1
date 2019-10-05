package com.nt.string_01;

public class First_Non_Repeated_Char_04_2 {

	public static void main(String[] args) {
		String s = "sezimplest";
		char[] count=new char[256];
		int index = 0,j; 
		for (int i = 0; i < s.length();  i++) {
            count[s.charAt(i)]++; 
		   // System.out.println(count);
		}  
        for (j = 0; j < s.length();  j++) 
        { 
            if (count[s.charAt(j)] == 1) 
            { 
                index = j; 
                break; 
            }    
        } 
        System.out.println(s.charAt(index));
		
	}

}
