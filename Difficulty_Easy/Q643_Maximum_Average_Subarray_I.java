package Difficulty_Easy;

public class Q643_Maximum_Average_Subarray_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5 };
		int k = 1;
		double average = 0;
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		average = sum / k;

		for (int i = k; i < nums.length; i++) {
			sum += nums[i];
			sum = sum - nums[i - k];
			average = Math.max(average, sum / k);
		}
//		System.out.println(String.format("%.5f", average));
		System.out.println(average);
	}

}
