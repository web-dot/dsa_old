package com.dsa.array;

import java.util.Arrays;

public class ArraySortingSearching {
	
	/*Insertion Sort*/
	
	/*
	 * Psudocode
	 * 
	 * make the first element as sorted
	 * for each unsorted element X
	 * 	'extract' the element
	 * 		for j = lastSortedIndex down to 0
	 * 			if current element j > X
	 * 				move the selected element to the right by 1
	 * break loop and insert X here
	 * 
	 * */
	
	
	public static int[] insertionSor(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {43, 41, 26, 20, 27, 34, 7, 15, 22, 31};
		int[] res = insertionSor(arr);
		System.out.println(Arrays.toString(res));
	}
}
