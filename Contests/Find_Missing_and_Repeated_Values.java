package Contests;

import java.util.*;

public class Find_Missing_and_Repeated_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		int[][] arr = {{9,1,7},{8,9,2},{3,4,6}};
		int[] ans = new int[2];
		for(int[] v : arr) {
			for(int n : v) {
				set.add(n);
			}
		}
		
		System.out.println(set);
	}
	
}
