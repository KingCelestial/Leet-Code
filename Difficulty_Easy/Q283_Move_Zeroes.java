package Difficulty_Easy;

public class Q283_Move_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,0,4,0,0,0,5};
		int writer = 0;
		for(int reader = 0;reader < nums.length;reader++) {
			if(nums[reader] !=0) {
				nums[writer] = nums[reader];
				writer++;
			}
		}
		while(writer < nums.length) {
			nums[writer] = 0;
			writer++;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
