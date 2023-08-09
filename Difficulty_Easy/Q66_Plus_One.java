package Difficulty_Easy;

import java.util.Scanner;

public class Q66_Plus_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {9};
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==9) {
				count1++;
			}
			count2++;
		}
		if(count1==count2) {
			int []newarr = new int [count2+1];
			for(int k=0;k<newarr.length;k++) {
				int i=1;
				for(int j=0;j<arr.length;j++) {
					newarr[i]=arr[j];
					i++;
				}
			}
			arr=newarr;
		}
		int j=arr.length-1;
		for(;j>0;j--) {
			if(arr[j]==9) {
				arr[j]=0;
			}
			else {
				break;
			}
	}
		arr[j]=arr[j]+1;

	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
}
	public static int count(int []arr) {
		int i=0;
		for(;i<arr.length;i++) {
		}
		return i;
	}
}
