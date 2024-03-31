package Difficulty_Hard;
import java.util.*;
public class Q2444_Count_Subarrays_With_Fixed_Bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,2,7,5};
		int minK = 1, maxK = 5;
		
		int count=0, left=-1, min=-1, max=-1;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]<minK || nums[i]>maxK) left=i;
			if(nums[i]==minK) min =i;
			if(nums[i]==maxK) max =i;
			count += Math.max(0, Math.min(max, min)-left);
		}
		System.out.println(count);
	}

}
