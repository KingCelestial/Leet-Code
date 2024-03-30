package Difficulty_Medium;

import java.util.Arrays;
import java.util.Iterator;

public class Q80_Remove_Duplicates_from_Sorted_Array_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,1,2,3,3};
		int count=0;
		if(nums.length==2) {
			System.out.println('2');
		}else {
			int i=0,j=i+1,k=i+2;
			for (; k < nums.length;k++) {
				if(nums[i]==nums[j] && nums[j]==nums[k]) {
					while(k<nums.length && nums[k]==nums[j]) {
						nums[k] = Integer.MAX_VALUE;
						count++;
						k++;
					}
					i=k;
					j=i+1;
					k=j;
				}
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println(nums.length-count);
		
	}

}
