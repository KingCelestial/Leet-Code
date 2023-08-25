package Difficulty_Hard;

import java.util.Scanner;

public class Q42_Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		System.out.println(Water(arr));
	}
	public static int Water(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		int[] right = new int[n];
		right[n-1]=arr[n-1];
		for(int j=n-2;j>=0;j--) {
			right[j]=Math.max(right[j+1], arr[j]);
		}
		int sum=0;
		for(int k=0;k<arr.length;k++) {
			sum=sum+Math.min(left[k], right[k])-arr[k];
		}
		return sum;
	}

}
