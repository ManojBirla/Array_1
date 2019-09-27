package com.nt.Arrays_2;

import java.util.Arrays;

public class Segregate0and3_2 {

	public static void main(String[] args) {
		int[] arr={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int[] arr1= new int[arr.length];
		int j=0;
		int k=arr.length/2;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				arr1[j]=arr[i];
				System.out.println(arr[j]);
				
				j++;
			}
			else  if(arr[i]==1){
					arr1[k]=arr[i];
					System.out.println(arr1[j]);
					 k++;
				}
			
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
