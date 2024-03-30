package Difficulty_Medium;

public class Q2962_Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 2, 3, 3 };
		int k = 2;
		int max =Integer.MIN_VALUE;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		int start=0, maxWindow=0, ans=0;
		for(int end = 0; end<nums.length;end++) {
			if(nums[end] == max) {
				maxWindow++;
			}
			while(k==maxWindow) {
				if(nums[start]==max) {
					maxWindow--;
				}
				start++;
			}
			ans += start;
		}
		System.out.println(ans);
	}

}
