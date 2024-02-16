package Difficulty_Medium;
import java.util.*;
public class Q390_Elimination_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		List<Integer> ll = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			ll.add(i);
		}
		Check(n,ll,0,true);
	}

	private static void Check(int n, List<Integer> ll,int idx,boolean x) {
		// TODO Auto-generated method stub
		
		if(ll.size()==1) {
			System.out.println(ll);
			return;
		}
		if(idx > ll.size()) {
			x = false;
			idx = ll.size()-1;
		}
		if(idx < 0) {
			x = true;
			idx = 0;
		}
		if(idx >=0 && idx < ll.size()) {
			ll.remove(idx);
		}
		if(x) {
			idx ++;
		} else {
			idx -=2;
		}
		Check(n,ll,idx,x);
	}

}
