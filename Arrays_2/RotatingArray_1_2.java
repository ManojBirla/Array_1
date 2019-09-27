package com.nt.Arrays_2;

import java.util.Arrays;

public class RotatingArray_1_2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int len = arr.length;
		int p = 2;

		for (int i = 0; i < 2; i++) {
			int j, temp;
			temp = arr[0];
			// System.out.println(temp);
			for (j = 0; j < len - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}

}
