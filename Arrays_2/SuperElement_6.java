package com.nt.Arrays_2;

public class SuperElement_6 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 6};
		int len = arr.length;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					count++;
					temp = arr[i];
					

				}
			}
			if (count >= 2) {
				System.out.println("super element " + temp);
			}

		}

	}
}
