package com.nt.string_01;

public class Remove_Special_Char_05 {

	public static void main(String[] args) {
		String s = "$ja!va$&st%arP";
	    char[] s1=s.toCharArray();
	    int ascii=0;
	    for(int i = 0; i < s.length(); i++) {
			//System.out.println(s.charAt(i));
			ascii=s.charAt(i);
			if(ascii>=97 && ascii<=122 || ascii>=65 && ascii<=90) {
				System.out.print(s.charAt(i));
			}
		}
		
	}

}
