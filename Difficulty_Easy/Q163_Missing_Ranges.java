package Difficulty_Easy;
import java.util.*;
public class Q163_Missing_Ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,3,50,75};
		int lower = 0;
		int upper = 99;
		List<List<Integer>> ll = new ArrayList<>();
		int[] arr = new int[2];
		if(nums.length==0) {
			ll.add(Arrays.asList(lower,upper));
		}
		if(nums[0] > lower) {
			ll.add(Arrays.asList(lower, nums[0]-1));
		}
		for (int i = 0; i < nums.length-1; i++) {
			if((nums[i+1]-nums[i] > 1) && nums[i+1] <= upper && nums[i] >= lower) {
				ll.add(Arrays.asList(nums[i]+1, nums[i+1]-1));
			}
		}
		if(nums[nums.length-1] < upper) {
			ll.add(Arrays.asList(nums[nums.length-1] + 1, upper));
			arr[0] = nums[nums.length-1] + 1;
		}
		System.out.println(ll);
	}

}
