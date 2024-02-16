package Difficulty_Easy;

public class Q326_Power_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(PowerOfThree(n,0));
	}

	private static boolean PowerOfThree(int n, int x) {
		// TODO Auto-generated method stub
		
		if(Math.pow(3, x) == n) {
			return true;
		}
		
		if(Math.pow(3, x) > n) {
			return false;
		}
		return PowerOfThree(n,x+1);
	}

}
