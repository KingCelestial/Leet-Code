package Difficulty_Easy;

import java.util.Scanner;

public class Q258_Add_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		while(n!=0) {
			int rem=0;
			int sum=0;
			while(n!=0) {
				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			n=sum;
			if(n<=9) {
				System.out.println(sum);
				break;
			}
		}
	}

}
