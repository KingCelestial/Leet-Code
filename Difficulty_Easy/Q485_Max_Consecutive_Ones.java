package Difficulty_Easy;

public class Q485_Max_Consecutive_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,0,1,1,1};
		int count = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]== 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count=0;
			}
		}
		max = Math.max(max, count);
		System.out.println(max);
	}

}
