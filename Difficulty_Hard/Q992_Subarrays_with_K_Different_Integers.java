package Difficulty_Hard;

import java.util.*;

public class Q992_Subarrays_with_K_Different_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 2, 3 };
		int k = 2;
		System.out.println(check(nums,k) - check(nums, k-1));
	}

	private static int check(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		int start = 0, ans = 0;
		for (int end = 0; end < nums.length; end++) {
			map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
			while (map.size() > k) {
				map.put(nums[start], map.get(nums[start]) - 1);
				if(map.get(nums[start])==0) {
					map.remove(nums[start]);
				}
				start++;
			}
			ans += (end-start +1);
		}
		return ans;
	}

}
