package Difficulty_Easy;
import java.util.*;
public class Q219_Contains_Duplicate_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		int k = 3;
		System.out.println(check(nums,k));
	}

	private static boolean check(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				if(Math.abs(map.get(nums[i])-i) <=k) {
					return true;
				} else {
					map.put(nums[i], i);
				}
			} else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

}




















//int i=0;
//int j=nums.length-1;
//while(i<j) {
//	if(nums[i] == nums[j] && (Math.abs(i-j)<=k)) {
//		return true;
//	} else {
//		i++;
//		j--;
//	}
//}
//return false;
