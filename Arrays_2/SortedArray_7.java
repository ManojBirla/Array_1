package com.nt.Arrays_2;

import java.util.Arrays;

public class SortedArray_7 {
	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int len=arr.length;
		int arr1[]=new int[len];
		int small=0,large=len-1;
		boolean flag=true;
		
		for (int i = 0; i < len; i++) {
			if(flag) {
				arr1[i]=arr[large];
				large--;
			}
			else {
				arr1[i]=arr[small];
				small++;
			}
			flag=!flag;
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
