package Difficulty_Easy;
import java.util.*;
public class Q575_Distribute_Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1000,1,1,1};
		int count=1;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		System.out.println(map.size());
	}

}
