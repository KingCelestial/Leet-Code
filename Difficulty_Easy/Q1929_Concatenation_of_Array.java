package Difficulty_Easy;

public class Q1929_Concatenation_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2,1};
		int n = nums.length;
		int[] ans = new int[2*n];
		int j=0;
		for(int i=0; i<ans.length;i++) {
			j = i%n;
			ans[i] = nums[j];
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
