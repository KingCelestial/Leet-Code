package Difficulty_Easy;

import java.util.Arrays;

public class Q594_Longest_Harmonious_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2,2,5,2,3,7};
		Arrays.sort(nums);
		int left = 0, answer = 0;
		for(int right =0; right<nums.length; right++) {
			if(nums[right]-nums[left] == 1) {
				answer = Math.max(answer, right-left+1);
			}
			
			while(nums[right] -nums[left] > 1) {
				left++;
			}
		}
		System.out.println(answer);
	}

}
