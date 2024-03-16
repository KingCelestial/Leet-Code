package Difficulty_Easy;

public class Q724_Find_Pivot_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,-1};
		int sum=0, leftsum=0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			if(leftsum == sum - leftsum - nums[i]) {
				System.out.println(i);
			}
			leftsum += nums[i];
		}
		System.out.println(-1);
		
	}

}
