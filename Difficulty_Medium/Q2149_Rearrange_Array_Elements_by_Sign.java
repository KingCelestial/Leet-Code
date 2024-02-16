package Difficulty_Medium;

public class Q2149_Rearrange_Array_Elements_by_Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, 1 };
		int[] ans = new int[nums.length];
		int e = 0;
		int o = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				ans[e] = nums[i];
				e += 2;
			} else {
				ans[o] = nums[i];
				o += 2;
			}
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
