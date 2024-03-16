package Difficulty_Medium;

import java.util.Iterator;

public class Q930_Binary_Subarrays_With_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 0, 1, 0, 1 };
		int goal = 2;
		int start = 0;
		int sum =0;
		int count=0;
		for (int end = 0; end < nums.length; end++) {
			sum += nums[end];
			while(start <= end && sum > goal) {
				sum -= nums[start];
				start++;
			}
			count += end -start +1;
		}
		
	}

}
