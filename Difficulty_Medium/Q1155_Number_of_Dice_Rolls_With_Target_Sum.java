package Difficulty_Medium;

public class Q1155_Number_of_Dice_Rolls_With_Target_Sum {
	private static final int MOD = 1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int k = 6;
		int t = 7;
		System.out.println(diceRoll(n,k,t,new int[n+1][t+1]));
	}

	private static int diceRoll(int dice, int faces, int target, int[][] memo) {
		// TODO Auto-generated method stub
		
		if(dice==0 && target==0) {
			return 1;
		}
		
		if(dice==0 || target<0) {
			return 0;
		}
		
		if(memo[dice][target] !=0) {
			return memo[dice][target];
		}

		
		int ways=0;
		for(int i=1;i<=faces;i++) {
			ways = (ways + diceRoll(dice-1,faces,target-i,memo)) % MOD;
		}
		memo[dice][target] = ways;
		return ways;
	}
}
