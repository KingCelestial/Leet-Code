package Difficulty_Medium;

import java.util.Arrays;

public class Q2971_Find_Polygon_With_the_Largest_Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,12,1,2,5,50,3};
		Arrays.sort(nums);
		for (int i = nums.length-1; i >=0; i--) {
			long sum=0;
			for (int j = 0; j < i; j++) {
				sum+=nums[j];
			}
			if(sum>nums[i]) {
				System.out.println(sum+nums[i]);
				break;
			}
//			System.out.print(nums[i]+" ");
//			System.out.print(sum);
//			System.out.println();
		}
		System.out.println(-1);
		
	}

}
