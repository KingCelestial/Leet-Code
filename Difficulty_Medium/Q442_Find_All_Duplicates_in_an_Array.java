package Difficulty_Medium;
import java.util.*;
public class Q442_Find_All_Duplicates_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> ans = new ArrayList<>();
		Set<Integer> seen = new HashSet<>();
		for(int num : nums) {
			if(seen.contains(num)) {
				ans.add(num);
			} else {
				seen.add(num);
			}
		}
		System.out.println(ans);
	}

}
