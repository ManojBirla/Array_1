package com.nt.string_01;

public class SubString_08 {

	public static void main(String[] args) {
		String s = "dhimanmanmanjaman";
		String sb = "man";

		int len_s = s.length();
		int len_sb = sb.length();
		System.out.println(len_s);
		System.out.println(len_sb);
		int res=0;

		for(int i = 0; i <= len_s - len_sb; i++) {
			int j;
			for (j = 0; j < len_sb; j++) {
				System.out.println("outside "+j);
				if (s.charAt(i + j) != sb.charAt(j)) {
					
					System.out.println(s.charAt(i + j)+" i: "+i);
					break;
				}
				
			}//for
			
			if(j==len_sb) {
				res++;
				//System.out.println(res);
				j=0;
			}//if

		}//for
       System.out.println(res);
	}

}
