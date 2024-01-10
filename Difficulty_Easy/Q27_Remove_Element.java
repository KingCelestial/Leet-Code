package Difficulty_Easy;

public class Q27_Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int reader = 0;
		int writer =0;
		while(reader<nums.length) {
			if(nums[reader] == val) {
				reader++;
			} else {
				nums[writer] = nums[reader];
				reader++;
				writer++;
			}
		}
		System.out.println(writer);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
