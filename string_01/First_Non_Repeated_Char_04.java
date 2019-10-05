package com.nt.string_01;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public class First_Non_Repeated_Char_04{

	public static void main(String[] args) {
		String s = "simplest";
		String[] s1=s.split("");
		System.out.println(Arrays.toString(s1));
		Map<String,Integer> map=new LinkedHashMap();
		for (int i = 0; i < s1.length; i++) {
			if(map.containsKey(s1[i])) {
				map.put(s1[i],map.get(s1[i])+1);
			}
			else {
				map.put(s1[i],1);
			}
		}
		
		//System.out.println(map);
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("it is first non repeatable character::"+entry.getKey());
				break;
			}
		}//for
		
	}

}
