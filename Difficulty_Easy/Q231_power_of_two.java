package Difficulty_Easy;

import java.util.Scanner;

public class Q231_power_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
//		for(int i=2;i<=n;i=i*2){
		int i=1;
		while(i<n) {
			i=i*2;
        }
		if(i==n){
            System.out.println("true");
        }
		else {
			System.out.println("false");
		}
        
    }
}

