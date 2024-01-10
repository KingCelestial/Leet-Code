package Difficulty_Easy;

import java.util.Arrays;

public class Q455_Assign_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g = {1,2};
		int[] s = {1,2,3};
		check(g,s);
	}

	private static void check(int[] g, int[] s) {
		// TODO Auto-generated method 
		int count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		for (int i = 0; i < s.length && i < g.length; i++) {
			if(s[i]==g[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
