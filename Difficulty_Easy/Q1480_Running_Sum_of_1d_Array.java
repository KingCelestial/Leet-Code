package Difficulty_Easy;

public class Q1480_Running_Sum_of_1d_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            nums[i] = sum;
        }
        for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] +" ");
		}
	}

}
