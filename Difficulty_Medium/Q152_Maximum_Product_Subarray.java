package Difficulty_Medium;

public class Q152_Maximum_Product_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,2};
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			int sum = 1;
			for (int j = i; j < nums.length; j++) {
				sum = sum * nums[j];
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}

}
