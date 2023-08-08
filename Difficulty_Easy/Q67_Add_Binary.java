package Difficulty_Easy;

import java.util.Scanner;

public class Q67_Add_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int a = kc.nextInt();
		int b = kc.nextInt();
		int sum1 = (Binary_to_Decimal(a) + Binary_to_Decimal(b));
		System.out.println(Decimal_to_Binary(sum1));
	}
	public static int Binary_to_Decimal(int a) {
		int sum=0;
		int mul=1;
		while(a>0) {
			int rem=a%10;
			sum=sum+rem*mul;
			a/=10;
			mul*=2;
		}
		return sum;
	}
	public static int Decimal_to_Binary(int sum1) {
		int sum=0;
		int mul=1;
		while(sum1>0) {
			int rem = sum1%2;
			sum=sum+rem*mul;
			mul*=10;
			sum1/=2;
		}
		return sum;
}

}
