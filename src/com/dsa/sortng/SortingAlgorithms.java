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
	
	/**
	 * repeat (numOfElements - 1) times
	 * 	set the first unordered element as minimum
	 * 	for each unsorted elements 
	 * 		if element < currentMinimum
	 * 			set element as new minimum
	 * swap minimum with first unsorted position
	 * */
	
	private static int[] selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			System.out.println("min =" + arr[min]);
			System.out.println("arr[i] =" + arr[i]);
			for(int j=i+1; j<arr.length; j++) {
				System.out.println("arr[j] =" + arr[j]);
				if(arr[j] < arr[min]) {
					min = j;
					System.out.println("new min =" + arr[min]);
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {44,10,46,11,26,36,29,48,25,43,39};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

}
