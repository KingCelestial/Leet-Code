package Difficulty_Easy;

import java.util.*;

public class Q2441_Largest_Positive_Integer_That_Exists_With_Its_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,8,6,7,-2,-3};
		HashSet<Integer> set = new HashSet<>();
		
		for(int v : nums) {
			set.add(v);
		}
		
		int res = -1;
		
		for(int v : set) {
			if(v >res && set.contains(-v)) {
				res = v;
			}
		}
		System.out.println(res);
	}

}
