package Difficulty_Medium;
import java.util.*;
public class Q77_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		List<List<Integer>> result = new ArrayList<>();
		Combinations(n,k,new ArrayList<>(), result, 1);
		System.out.println(result);
	}

	private static void Combinations(int n, int k, List<Integer> curr, List<List<Integer>> result, int idx) {
		// TODO Auto-generated method stub
		if(k==0) {
			result.add(new ArrayList<>(curr));
			return;
		}
		for(int i=idx;i<=n;i++) {
			curr.add(i);
			Combinations(n , k-1, curr, result, i+1);
			curr.remove(curr.size()-1);
		}
	}

}
