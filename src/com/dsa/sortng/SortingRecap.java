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
		for(int i=0; i<arr.length; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	

	public static void main(String[] args) {
		int[] arr = {4, 3, 1, 2};
		int[] out = selectionSort(arr);
		System.out.println(Arrays.toString(out));
	}

}
