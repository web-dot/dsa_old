package com.dsa.sortng;

import java.util.Arrays;

public class SortingAlgorithms {

	public static int[] insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	
	private static int[] selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 3, 1, 2};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

}
