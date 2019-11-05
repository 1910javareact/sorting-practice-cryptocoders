package com.revature.sort;

import java.util.Arrays;

public class MergeSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length >= 2) {
			int half = arr.length/2;
			int[] left = Arrays.copyOfRange(arr, 0, half);
			int[] right = Arrays.copyOfRange(arr, half, arr.length);
			//System.out.println(half);
			
			sort(left);
			sort(right);
			merge(arr, left, right);
		}
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
		int l = 0;
		int r = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if ((r >= right.length) || ((l < left.length) && (right[r] > left[l]))) {
				arr[i] = left[l];
				l++;
			}else {
				arr[i] = right[r];
				r++;
			}
				
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
