package Difficulty_Easy;

import java.util.Scanner;

public class Q367_Valid_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int num = kc.nextInt();
		System.out.println(ValidPerfectSquare(num));
	}
	public static boolean ValidPerfectSquare(int num) {
		int j =0;
		for(int i=1;j<num;i++) {
			j = i*i;
		}
		return j==num;
	}

}