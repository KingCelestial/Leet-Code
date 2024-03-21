package Difficulty_Medium;
import java.util.*;
public class Q386_Lexicographical_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		List<Integer> result = new ArrayList<>();
		check(n,0,result);
		System.out.println(result);
	}

	private static void check(int n, int curr,List<Integer> result) {
		// TODO Auto-generated method stub
		
		if(curr > n) {
			return;
		}
		if(curr!=0) {
			result.add(curr);
		}
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			check(n,curr*10+i,result);
		}
	}

}
