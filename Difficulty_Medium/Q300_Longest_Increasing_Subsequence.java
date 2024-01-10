package Difficulty_Medium;
import java.util.*;
public class Q300_Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,9,2,5,3,7,101,18};
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			int temp = i;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[j] > nums[temp]) {
					count++;
					temp = j;
				}
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}

}
