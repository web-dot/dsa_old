package com.dsa.array;

import java.util.Arrays;

public class ArrayOperations {

	
	//
	public static int[] shiftArray(int[] nums, int position, int value) {

		if (nums.length <= 0) {
			return nums;
		} else {

			for (int i = nums.length - 2; i >= position; i--) {
				nums[i + 1] = nums[i];
			}
		}
		nums[position] = value;
		return nums;
	}
	
	
	public static int binarySearch(int[] arr, int item) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			int mid = start + (end - start) / 2;
			System.out.println("mid = " + arr[mid]);
			if(item == arr[mid]) {
				return mid;
			}
			else if(item < arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {3,2,1,4,5};
		System.out.println(binarySearch(arr, 4));
//		int[] nums = new int[] { 2 };
//		System.out.println(Arrays.toString(shiftArray(nums, 0, 1)));

	}
}
