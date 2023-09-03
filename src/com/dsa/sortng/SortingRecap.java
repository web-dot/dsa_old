package com.dsa.sortng;

import java.util.Arrays;

public class SortingRecap {
	
	public static int[] insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int sorted = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > sorted ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = sorted;
		}
		return arr;
	}
	
	
	public static int[] selectionSort(int[] arr) {
		
		return null;
	}
	

	public static void main(String[] args) {
		int[] arr = {4, 3, 1, 2};
		int[] out = insertionSort(arr);
		System.out.println(Arrays.toString(out));
	}

}
