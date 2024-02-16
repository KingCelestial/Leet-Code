package Difficulty_Medium;
import java.util.*;
public class Q216_Combination_Sum_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int k = 3;
		List<List<Integer>> result = new ArrayList<>();
		check(n,k,new ArrayList<>(), result, 1);
		System.out.println(result);
	}

	private static void check(int n, int k, List<Integer> curr, List<List<Integer>> result, int idx) {
		// TODO Auto-generated method stub
		if(n==0 && k==0) {
			result.add(new ArrayList<>(curr));
			return;
		}
		if(n<0 || k<0) {
			return;
		}	
		for(int i=idx;i<=9;i++) {
			if(i<=n) {
				curr.add(i);
				check(n-i, k-1, curr, result, i+1);
				curr.remove(curr.size()-1);
			}
		}
	}

}
