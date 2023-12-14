package Difficulty_Easy;

import java.util.Arrays;

public class Q121_Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,1};
		check(arr);
	}
	
	public static void check(int[] arr) {
		
		int pointer = 0;
		int min = arr[0];
		int max = arr[0];
		int profit = 0;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				max=arr[i];
//				System.out.println(min);
			}
			if(max<arr[i]) {
				max=arr[i];
//				System.out.println(max);
			}
			
			if((max-min)>profit) {
				profit = (max-min);
			}
		}
		
		System.out.println(profit);
		
	}

}
