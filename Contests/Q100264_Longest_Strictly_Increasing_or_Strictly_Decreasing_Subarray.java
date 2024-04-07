package Contests;

public class Q100264_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3};
		int lengthCount=1, maxLenght=0;
		for(int right=1; right<nums.length;right++) {
			if(nums[right] > nums[right - 1]) lengthCount++;
			else {
				lengthCount=1;
			}
			maxLenght = Math.max(maxLenght, lengthCount);
			
		}
		lengthCount=1;
		for(int right=1; right<nums.length;right++) {
			if(nums[right] < nums[right - 1]) lengthCount++;
			else {
				lengthCount=1;
			}
			maxLenght = Math.max(maxLenght, lengthCount);
			
		}
		System.out.println(Math.max(maxLenght, lengthCount));
	}

}
