package Difficulty_Medium;

import java.util.Scanner;

public class Q189_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int k = kc.nextInt();
		int n = kc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		Rotate(arr,k);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
	}
	public static void Rotate(int[] arr, int k) {
		int n=arr.length;
		k=k%n;
		Reverse(arr, 0, n-k-1);
		Reverse(arr, n-k, n-1);
		Reverse(arr, 0, n-1);
	}
	public static void Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int item = arr[i];
			arr[i]=arr[j];
			arr[j]=item;
			i++;
			j--;
		}
	}

}
