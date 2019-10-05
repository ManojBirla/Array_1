package com.nt.string_01;

import java.util.Arrays;

public class Anagrams_Strings_06 {

	public static void main(String[] args) {
		String s1 = "rahulA";
		String s2=  "hulra";
		char[] new_s1 =new char[s1.length()];
		char[] s1_arr=s1.toCharArray();
		char[] s2_arr=s2.toCharArray();
		String[] new_s2_arr=new String[s1_arr.length];
		String[] new_s1_arr=s1.split("");
		for (int i = 0; i < s1_arr.length; i++) {
			for (int j = 0; j < s2_arr.length; j++) {
				if(s1_arr[i]==s2_arr[j]) {
					
					new_s2_arr[i]=s2_arr[j]+"";
					System.out.print(s1_arr[i]+" "+s2_arr[j]);
					System.out.println();
				}
			}
		}
		System.out.println("s3 "+Arrays.toString(new_s1_arr));
		System.out.println("s4 "+Arrays.toString(new_s2_arr));
		System.out.println(Arrays.equals(new_s1_arr,new_s2_arr));
		if(Arrays.equals(new_s1_arr,new_s2_arr)) {
			System.out.println("yes it is Anagrams");
		}else {
			System.out.println("it is not Anagrams");
		}


	}

}
