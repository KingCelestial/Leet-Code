package Difficulty_Easy;
import java.util.*;
public class Q1137_N_th_Tribonacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(dfs(n));
	}
	
	private static Map<Integer,Integer> dp = new HashMap<>() {{
		put(0,0);
		put(1,1);
		put(2,1);
	}};
	
	private static int dfs(int i) {
		if(dp.containsKey(i)) return dp.get(i);
		
		int answer = dfs(i-1)+dfs(i-2)+dfs(i-3);
		dp.put(i, answer);
		return answer;
	}
}
