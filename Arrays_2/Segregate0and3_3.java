package com.nt.Arrays_2;

import java.util.Arrays;

public class Segregate0and3_3 {

	public static void main(String[] args) {
		int[] arr={0,0,1,0,1,0,1,0,0,1,1};
		int len=arr.length;
		int j=0;
		int ele1=0;
		int mid=0;
		
		
        for (int i = 0; i < len; i++) {
        	if(arr[i]<1) {
        		ele1=arr[j];
        		arr[j]=arr[i];
        		arr[i]=ele1;
        		j++;	
        	}	
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
