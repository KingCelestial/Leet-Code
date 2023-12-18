package Difficulty_Medium;

public class Q322_Coin_Change {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 3;
		int[] coins = {2,2,5};
		System.out.println(coinChange(coins, amount,0));
	}
	
	public static int coinChange(int[]coins, int amount,int count) {
		if(amount==0) {
			return count;
		}
		if(amount<0) {
			return -1;
		}
		
		int minCoins = Integer.MAX_VALUE;
		for(int i=0;i<coins.length;i++) {
			int result = coinChange(coins,amount-coins[i],count+1);
			if(result != -1) {
				minCoins = Math.min(result, minCoins);
			}
		}
		if(minCoins>1000) {
			return -1;
		}else {
			return minCoins;
		}
		
	}

}
