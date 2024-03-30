package Difficulty_Medium;
import java.util.*;
public class Q2958_Length_of_Longest_Subarray_With_at_Most_K_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,2,1,2,1,2};
		int k = 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0, start = -1;
		for(int end = 0; end<nums.length;end++) {
			map.put(nums[end], map.getOrDefault(nums[end], 0)+1);
			while(map.get(nums[end]) > k) {
				start++;
				map.put(nums[start], map.get(nums[start])-1);
			}
			ans = Math.max(ans, end-start);
		}
		System.out.println(ans);
	}

}
