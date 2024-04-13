package Difficulty_Medium;

public class Q55_Jump_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		check(nums,"",0);
	}

	private static void check(int[] nums, String ans, int idx) {
		// TODO Auto-generated method stub
		if(idx==nums.length-1) {
			System.out.println(ans);
			return;
		}
		
		if(idx > nums.length-1) {
			return;
		}
		
		for(int i = 0; i<nums.length; i++) {
			for(int j = i; j<= i + nums[i]; j++) {
				check(nums, ans+nums[j], j);
			}
		}
	}

}
