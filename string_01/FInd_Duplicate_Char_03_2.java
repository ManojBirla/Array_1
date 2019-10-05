package com.nt.string_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FInd_Duplicate_Char_03_2 {

	public static void main(String[] args) {
		String s = "madam";
		String[] s1=s.split("");
		System.out.println(Arrays.toString(s1));
		Map<String,Integer> map=new HashMap();
		for (int i = 0; i < s1.length; i++) {
			if(map.containsKey(s1[i])) {
				map.put(s1[i],map.get(s1[i])+1);
			}
			else {
				map.put(s1[i],1);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("duplicate No. is ::"+entry.getKey()+"="+entry.getValue());
			}
			
			
		}
		
	}

}
