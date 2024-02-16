package Difficulty_Medium;
import java.util.*;
public class Q198_House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(RobberTD(arr, 0, dp));
	}
	public static int RobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD(arr, i + 2, dp);// dp[i+2]
		int Dont_rob = RobberTD(arr, i + 1, dp);// dp[i+1]
		return dp[i] = Math.max(rob, Dont_rob);
	}
}
