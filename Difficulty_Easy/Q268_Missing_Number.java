package Difficulty_Easy;

import java.util.Scanner;

public class Q268_Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		System.out.println(MissingNumber(arr,n));
	}
	public static int MissingNumber(int []arr, int n) {
		int i =0;
		for(int j=0;j<arr.length;j++) {
			if(i==arr[j]) {
				i++;
				j=-1;
			}
		}
		return i;
	}	
}
