package Difficulty_Medium;
import java.util.*;
public class Q90_Subsets_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,4,4,4};
		List<List<Integer>> result = new ArrayList<>();
		check(nums,new ArrayList<>(), result,0);
		System.out.println(result);
	}

	private static void check(int[] nums, List<Integer> curr, List<List<Integer>> result,int i) {
		// TODO Auto-generated method stub
		
		if(i==nums.length) {
			if(!result.contains(curr)) {
				result.add(new ArrayList<>(curr));
			}
			return;
		}
		check(nums,curr,result,i+1);
		curr.add(nums[i]);
		check(nums,curr,result,i+1);
		curr.remove(curr.size()-1);
	}

}
