package Difficulty_Medium;
import java.util.*;
public class Q1823_Find_the_Winner_of_the_Circular_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 6;
		int k = 5;
		List<Integer> ll = new ArrayList<>();
		for (int i = 1; i <= p; i++) {
			ll.add(i);
		}
		System.out.println(check(k,k,ll,-1));
	}

	private static int check(int n, int k, List<Integer> ll, int idx) {
		// TODO Auto-generated method stub
		if(ll.size()==1) {
			return ll.remove(0);
		}
		if(idx > ll.size()-1) {
			idx = 0;
		}
		if(k==0) {
			ll.remove(idx);
			k=n;
			idx -= 1;
		}
		return check(n,k-1,ll,idx+1);
	}

}
