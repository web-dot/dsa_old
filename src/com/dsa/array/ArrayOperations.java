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

	public static void main(String[] args) {

		int[] nums = new int[] { 2 };
		System.out.println(Arrays.toString(shiftArray(nums, 0, 1)));

	}
}
