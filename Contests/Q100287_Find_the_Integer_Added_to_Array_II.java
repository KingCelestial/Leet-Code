package Contests;

import java.util.Arrays;

public class Q100287_Find_the_Integer_Added_to_Array_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,20,16,12,8}, nums2 = {14,18,10};
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i]+" ");
		}
		int i=0;
		while(i <=1  && nums1[i]<= nums2[i]) {
			i++;
		}
		System.out.println(nums2[i]-nums1[i]);
	}

}
