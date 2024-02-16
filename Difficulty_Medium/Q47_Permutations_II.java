package Difficulty_Medium;

import java.util.*;

public class Q47_Permutations_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		permutations(new ArrayList<>(),result,nums,0);
		System.out.println(result);
	}
	
	private static void permutations(List<Integer> curr, List<List<Integer>> result, int[] nums, int idx) {
		
		if(curr.size()==nums.length) {
//			if(!result.contains(curr)) {
				result.add(new ArrayList<>(curr));
//			}
			return;
		}
		
		
		for (int i = idx; i < nums.length; i++) {
				curr.add(nums[i]);
				permutations(curr,result,nums,i);
				curr.remove(curr.size()-1);
		}
	}
}
