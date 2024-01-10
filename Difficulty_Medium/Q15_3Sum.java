package Difficulty_Medium;

import java.util.*;

public class Q15_3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		Arrays.sort(nums);
		List<List<Integer>> twoD = new ArrayList<>();
		threeSum(nums,twoD);
		for(List<Integer> s : twoD) {
			System.out.print(s);
		}
	}

	public static void threeSum(int[] nums, List<List<Integer>> twoD) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length-2;i++) {
			if(i==0 || (i>0 && nums[i] != nums[i-1])) {
				int j=i+1;
				int k = nums.length-1;
				while(j<k) {
					int sum = nums[i]+nums[j]+nums[k];
					if(sum == 0) {
						twoD.add(Arrays.asList(nums[i], nums[j], nums[k]));
						j++;
						k--;
						
						while(j<k && nums[j]==nums[j-1]) {
							j++;
						}
						
						while(j<k && nums[k]==nums[k+1]) {
							k--;
						}
					}
					else if(sum<0){
						j++;
					}
					else {
						k--;
					}
				}
			}
		}
	}
	
}
