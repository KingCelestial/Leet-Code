package Difficulty_Medium;

import java.util.*;

public class Q40_Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		Arrays.sort(candidates);
		List<List<Integer>> twoDList = new ArrayList<>();
		List<Integer> oneDList = new ArrayList<>();
		check(candidates,target,0,twoDList,oneDList);
		System.out.println(twoDList);
	}

	private static void check(int[] c, int t, int idx,List<List<Integer>> twoDList,List<Integer> oneDList) {
		// TODO Auto-generated method stub
		if(t==0) {
			twoDList.add(new ArrayList(oneDList));
			return;
		}
		for(int i=idx; i<c.length;i++) {
			
			if(i>idx && c[i] == c[i-1]) {
				continue;
			}

			if(t >= c[i]) {
				oneDList.add(c[i]);
				check(c,t-c[i],i+1,twoDList,oneDList);
				oneDList.remove(oneDList.size()-1);
			}
		}
	}
}
