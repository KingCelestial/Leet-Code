package Difficulty_Medium;

import java.util.Scanner;

public class Q53_Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		System.out.println(MaxSum(arr));
	}
	public static int MaxSum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			max = Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}

}
