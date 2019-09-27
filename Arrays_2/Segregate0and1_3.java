package com.nt.Arrays_2;

import java.util.Arrays;

public class Segregate0and1_3{

	public static void main(String[] args) {
		int[] arr={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int[] arr1= new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				arr1[j]=arr[i];
				System.out.println(arr[j]);
				j++;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			 if(arr[i]==1){
				arr1[j]=arr[i];
				System.out.println(arr1[j]);
				 j++;
			}
       }
		System.out.println(Arrays.toString(arr1));
		
	}
}
