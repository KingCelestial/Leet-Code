package Difficulty_Easy;

import java.util.Scanner;

public class Q233_Number_of_Digit_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int num=counter(n);
		int count = (int)((num-1)*(Math.pow(10, num-2))+1);
		int i=(int)((Math.pow(10, num-1))+1);
		for(;i<=n;i++) {
			int p=i;
			while(p>0) {
				int rem=p%10;
				if(rem==1) {
					count++;
				}
				p=p/10;
			}
		}
		System.out.println(count);

	}
	public static int counter(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}

}
