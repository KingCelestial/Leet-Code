package Difficulty_Easy;

public class Q2485_Find_the_Pivot_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, i = 0, j = n, sum1 = 0, sum2 = n;
		while (i < j) {
			if (sum1 <= sum2) {
				i++;
				sum1 += i;
			} else {
				j--;
				sum2 += j;
			}
		}
		if (sum1 == sum2) {
			System.out.println(i);
		} else {
			System.out.println(-1);
		}
	}

}
