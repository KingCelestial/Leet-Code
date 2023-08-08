//Time limit is exeeding on input 129140162
package Difficulty_Easy;

import java.util.Scanner;

public class Q_342_Power_of_Four {
	public static void main(String[] args) {
		Scanner kc =new Scanner(System.in);
		int n = kc.nextInt();
		System.out.println(power_of_four(n));;
	}
	public static boolean power_of_four(int n) {
		int power=0;
		for(int i=0;i<=n;i++) {
		power =(int)(Math.pow(4, i));
		if(n==power){
			break;
		}
//		int i=0;
//		int power=0;
//		while(i<=n) {
//			power =(int)(Math.pow(4, i));
//			if(n==power){
//				break;
//			}
//			i++;
//		}
	}
		return n==power;

}
}
