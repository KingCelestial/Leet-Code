package Difficulty_Easy;

import java.util.Scanner;

public class Q9_Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int A=N;
		int rem=0;
		int sum=0;
		int mul=10;
		for(int i=1;A!=0;i++) {
			rem=A%10;
			sum=sum*mul+rem;
			A=A/10;
		}
		if(sum==N) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
