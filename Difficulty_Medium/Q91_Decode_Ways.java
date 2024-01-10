package Difficulty_Medium;

import java.util.Arrays;

public class Q91_Decode_Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "226";
		int[] arr = new int[s.length()];
		Arrays.fill(arr, -1);
		System.out.println(decodeWays(s,arr,0));
	}

	private static int decodeWays(String s, int[] arr, int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length) {
			return 1;
		}
		
		if(arr[idx] !=-1) {
			return arr[idx];
		}
		
		if(s.charAt(idx)=='0') {
			return 0;
		}
		
		int ways = decodeWays(s,arr,idx+1);
		if( idx+1 < s.length() && Integer.parseInt(s.substring(idx, idx+2)) <=26) {
			ways += decodeWays(s,arr,idx+2);
		}
		
		arr[idx] = ways;
		return ways;
	}
	

}
