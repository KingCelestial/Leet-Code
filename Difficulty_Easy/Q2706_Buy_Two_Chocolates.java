package Difficulty_Easy;

import java.util.*;

public class Q2706_Buy_Two_Chocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,3};
		int money = 3;
		System.out.println(check(arr,money));
	}

	private static int check(int[] arr, int money) {
		// TODO Auto-generated method stub
		int fm = Integer.MAX_VALUE;
		int sm = Integer.MAX_VALUE;
		for(int v : arr) {
			if(v< fm) {
				sm = fm;
				fm = v;
			} else {
				sm = Math.min(sm, v);
			}
		}
		
		int left = money - (fm+sm);
		
		return left >= 0 ? left : money;
	}

}
