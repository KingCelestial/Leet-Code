package Difficulty_Easy;

import java.util.*;

public class Q2089_Find_Target_Indices_After_Sorting_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,5,2,3};
		int target = 2;
		Arrays.sort(nums);
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==target) {
				al.add(i);
			}
		}
		System.out.println(al);
	}

}
