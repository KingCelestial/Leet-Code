package Difficulty_Medium;
import java.util.*;
public class Q78_Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> result = new ArrayList<>();
		subSets(nums,new ArrayList<>(), result, 0);
		System.out.println(result);
	}

	private static void subSets(int[] nums, List<Integer> curr, List<List<Integer>> result, int i) {
		// TODO Auto-generated method stub
		
		if(i==nums.length) {
			result.add(new ArrayList<>(curr));
			return;
		}
		
		subSets(nums,curr, result, i+1);
		curr.add(nums[i]);
		subSets(nums, curr, result,i+1);
		curr.remove(curr.size()-1);
	}

}
