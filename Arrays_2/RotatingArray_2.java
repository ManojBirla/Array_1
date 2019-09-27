package com.nt.Arrays_2;

import java.util.Arrays;

public class RotatingArray_2 {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int len=arr.length;
		int arr1[]= new int[3];
		int arr2[]= new int[len-3];
		int j=0;
		
		for (int i = 0; i < len; i++) {
			if(i<arr1.length) {
				arr1[i]=arr[i];
			}
			else if(i>=2) {
				arr2[j]=arr[i];
				j++;
			} 		
		}
		  int concate[]=new int[arr1.length+arr2.length];
		  System.arraycopy(arr2, 0, concate, 0, arr2.length);
          System.arraycopy(arr1, 0,concate, arr2.length,arr1.length );
		  System.out.println(Arrays.toString(concate));
		  int temp,i,p=1;
		  temp=concate[0];
		  for ( i = 0; i < p; i++) {
			 concate[i]=concate[i+1]; 
             concate[i+1]=temp;
		  }
		  System.out.println(Arrays.toString(concate));
     }

}
