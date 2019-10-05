package com.nt.Arrays_2;

public class LeaderElement_5_1 {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		int len = arr.length;
		int leaderlength = len / 2;
		System.out.println("total length::"+len);
        int temp=arr[0];
        int count=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				//System.out.println(count+" "+arr[i]);
				if(leaderlength<=count) {
					temp=arr[i];
					//System.out.println(arr[i]);
				}
			}  
  		}
        System.out.println("leader element is::"+temp);
	}

}
