package Difficulty_Medium;
import java.util.*;
public class Q46_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  nums = {1,2,3};
		List<List<Integer>> twoDlist = new ArrayList<>();
		List<Integer> oneDlist = new ArrayList<>();
		check(nums,twoDlist,oneDlist);
	}

	private static void check(int[] nums, List<List<Integer>> twoDlist, List<Integer> oneDlist) {
		// TODO Auto-generated method stub
		if(oneDlist.size()==nums.length) {
			twoDlist.add(new ArrayList<>(oneDlist));
			return;
		}

		for (int i =0; i < nums.length; i++) {
			if(!oneDlist.contains(nums[i])) {
				oneDlist.add(nums[i]);
				check(nums,twoDlist,oneDlist);
				oneDlist.remove(oneDlist.size()-1);
			}
		}
	}

}
