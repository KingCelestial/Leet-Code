package Contests;

import java.util.Arrays;

public class Q100285_Find_the_Integer_Added_to_Array_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1}, nums2 = {1};
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int res = nums2[0]-nums1[0];
		System.out.println(res);
	}

}
