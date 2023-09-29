package Difficulty_Easy;

import java.util.Scanner;

public class Q69_Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int k = kc.nextInt();
		System.out.println(Sqrt(k));
	}
	public static int Sqrt(int k) {
		int si = 0;
		int ei = k;
		int ans =0;
		while(si<=ei) {
			int mid = (si+((ei-si)/2));
			if(Math.pow(mid, 2)<=k) {
				ans=mid;
				si=mid+1;
			}
			else {
				ei=mid-1;
			}
		}
		return ans;
	}

}
