package Difficulty_Easy;

public class Q70_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int[] dp = new int[n+1];
		System.out.println(check(n,dp));
		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i]+" ");
		}
	}

	private static int check(int n, int[] dp) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		int one = check(n-1,dp);
		int two = check(n-2,dp);
		
		return dp[n] = one+two;
	}

}
