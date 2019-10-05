package com.nt.Arrays_2;

import java.util.Arrays;

public class Segregate0and4_3 {

	public static void main(String[] args) {
		int[] arr={2,0, 2,2,1, 0,2, 2,1,1,2};
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
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]==1) {
        		ele1=arr[j];
        		arr[j]=arr[i];
        		arr[i]=ele1;
        		j++;
        	}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
