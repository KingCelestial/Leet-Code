package Difficulty_Easy;

import java.util.Arrays;

public class Q746_Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] dp = new int[arr.length+1];
		Arrays.fill(dp, -1);
		int f = Min_Cost(arr, 0, dp);
		int s = Min_Cost(arr, 1, dp);
		System.out.println(Math.min(f, s));

	}

	public static int Min_Cost(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		
		if(dp[i] != -1) {
			return dp[i];
		}
		
		int f = Min_Cost(arr, i + 1, dp);
		int s = Min_Cost(arr, i + 2, dp);
		return dp[i] = arr[i] + Math.min(f, s);

	}

}
