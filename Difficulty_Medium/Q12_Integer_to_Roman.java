package Difficulty_Medium;

import java.util.HashMap;
import java.util.Map;

public class Q12_Integer_to_Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1994;
		Map<Integer,Character> map = new HashMap<>();
		map.put(1 , 'I');
		map.put(5 , 'V');
		map.put(10 , 'X');
		map.put(50 , 'L');
		map.put(100 , 'C');
		map.put(500 , 'D');
		map.put(1000 , 'M');
		check(map,n,"");
	}

	private static void check(Map<Integer, Character> map, int n, String ans) {
		// TODO Auto-generated method stub
		int i = 1;
		while(n>0) {
			int temp = n%10;
			int temp2 = temp*i;
			if(temp2 > 2000) {
				temp2 = 0;
			}
			if(temp2 == map.get(temp2+i)) {
				
			}
			i*=10;
			n /= 10;
		}
		System.out.println(ans);
	}

}
