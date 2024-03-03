package Difficulty_Easy;

import java.util.*;

public class Q1984_Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 9, 4, 1, 7, 8, 1, 6, 4, 7, 9, 6, 3, 1, 4, 7, 8, 5, 2, 1, 4, 5, 7, 9, 6, 2, 1, 45 };
		int k = 5;
		if (nums.length == 1) {
			System.out.println(0);
		}
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		int i = 0;
		int j = k - 1;
		while (j < nums.length) {
			min = Math.min(min, nums[j] - nums[i]);
			i++;
			j++;
		}
		System.out.println(min);
	}

}
