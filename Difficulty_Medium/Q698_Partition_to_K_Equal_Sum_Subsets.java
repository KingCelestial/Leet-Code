package Difficulty_Medium;

import java.util.*;

public class Q698_Partition_to_K_Equal_Sum_Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1, 1, 2, 2, 2, 2 };
		int k = 2;
		Map<Integer, Integer> map = new HashMap<>();
		subset(nums, k, 0, 0, map);
		System.out.println(map);
		for (int v : map.values()) {
			if (v >= k) {
				System.out.println(true);
			}
		}
		System.out.println(false);
	}

	private static Map<Integer, Integer> subset(int[] nums, int k, int i, int sum, Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		if (i == nums.length) {
			if (sum >= k) {
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
			return map;
		}
		map = subset(nums, k, i + 1, sum, map);
		map = subset(nums, k, i + 1, sum + nums[i], map);
		return map;
	}

}
