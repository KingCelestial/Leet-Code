package Difficulty_Easy;

import java.util.Iterator;

public class Q2908_Minimum_Sum_of_Mountain_Triplets_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,6,1,5,3};
		int n = nums.length;
		int ans = 0;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = nums[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.min(left[i-1], nums[i]);
		}
		right[n-1] = nums[n-1];
		for (int i = n-2; i >0; i--) {
			left[i] = Math.min(left[i+1], nums[i]);
		}
		
		for(int i=1;i<n-1;i++) {
			if(left[i-1]<nums[i] && nums[i]>right[i+1]) {
				ans = Math.max(ans, left[i-1]+nums[i]+right[i+1]);
			}
		}
		
		System.out.println(ans);
		
	}

}
