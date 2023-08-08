package Difficulty_Easy;

import java.util.Scanner;

public class Q258_Add_Digits {

	public static void main(String[] args) {
		Scanner kc = new Scanner(System.in);
		int num = kc.nextInt();
		System.out.println(addDigits(num));
	}
		public static int addDigits(int num) {
			int count=counter(num);
			while(count>1) {
				int sum=0;
				while(num>0) {
					int rem = num%10;
					sum=sum+rem;
					num/=10;
				}
				num=sum;
				count=counter(num);
			}
			return num;
	}
	public static int counter(int num) {
		int count =0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
		
	}

}
