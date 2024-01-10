package Contests;

import java.util.Arrays;

public class Q100148_Minimum_Number_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5};
		int[] ans = new int[arr.length];
		minimum(arr, ans);
	}

	private static void minimum(int[] arr, int[] ans) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i+=2) {  // 2 3 4 5
			ans[i] = arr[i+1];
			ans[i+1] = arr[i];
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
