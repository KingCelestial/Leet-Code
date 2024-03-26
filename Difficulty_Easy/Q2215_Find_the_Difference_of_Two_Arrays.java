package Difficulty_Easy;

import java.util.*;

public class Q2215_Find_the_Difference_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1,2,3,3 }, nums2 = { 1,1,2,2 };
		List<List<Integer>> ans = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		int i = 0;
		while (i < nums1.length || i < nums2.length) {
			if (i < nums1.length) {
				set1.add(nums1[i]);
			}
			if (i < nums2.length) {
				set2.add(nums2[i]);
			}
			i++;
		}
		List<Integer> res1 = new ArrayList<>();
		for (int num : nums1) {
			if(!set2.contains(num) && !res1.contains(num)) {
				res1.add(num);
			}
		}
		ans.add(res1);
		List<Integer> res2 = new ArrayList<>();
		for (int num : nums2) {
			if(!set1.contains(num) && !res2.contains(num)) {
				res2.add(num);
			}
		}
		ans.add(res2);
		System.out.println(ans);
	}

}
