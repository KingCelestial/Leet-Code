package Difficulty_Medium;

import java.util.*;

public class Q47_Permutations_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> result = new ArrayList<>();
		permutations(new ArrayList<>(),new ArrayList<>(),result,nums,0);
		System.out.println(result);
	}
	
	private static void permutations(List<Integer> curr,List<Integer> ans, List<List<Integer>> result, int[] nums, int idx) {
		
		if(curr.size()==nums.length) {
				if(!result.contains(ans)) {
					result.add(new ArrayList<>(ans));	
				}
			return;
		}
		for (int i = 0; i < nums.length; i++) {
				if(curr.contains(i)) continue;
				curr.add(i);
				ans.add(nums[i]);
				permutations(curr,ans,result,nums,i);
				curr.remove(curr.size()-1);
				ans.remove(ans.size()-1);
		}
	}
}
