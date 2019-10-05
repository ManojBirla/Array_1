package com.nt.Arrays_2;

import java.util.HashMap;
import java.util.Map;

public class LeaderElement_5_2 {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		int len=arr.length;
		Map<Integer,Integer> map=new HashMap();
		for (int i = 0; i < len; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
				
			}else {
				map.put(arr[i],1);
			}	
		}
		System.out.println(map);
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()>=(len/2)) {
				System.out.println("leader number is "+entry.getKey());
			}
		}
	}
	
}
